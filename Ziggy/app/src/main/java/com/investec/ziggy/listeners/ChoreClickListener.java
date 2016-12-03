package com.investec.ziggy.listeners;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Toast;

import com.investec.ziggy.LoginActivity;
import com.investec.ziggy.apimodels.LoginModel;
import com.investec.ziggy.apimodels.TransferModel;
import com.investec.ziggy.common.BaseRest;
import com.investec.ziggy.common.PortfolioManager;
import com.investec.ziggy.handlers.LoginResponseHandler;
import com.investec.ziggy.handlers.TransferResponseHandler;
import com.investec.ziggy.models.portfoliomodels.Chore;
import com.investec.ziggy.models.portfoliomodels.Portfolio;

import org.json.JSONException;

import java.io.UnsupportedEncodingException;

/**
 * Created by Theodore.Koopman on 2016/12/02.
 */

public class ChoreClickListener implements AdapterView.OnItemClickListener {
    public ChoreClickListener(Context context) {
        this.setActivity(context);
    }

    private Context activity;

    private Context getActivity() {
        return activity;
    }

    private void setActivity(Context activity) {
        this.activity = activity;
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        BaseRest<TransferModel, String> portfolioRequest = new BaseRest<>(this.getActivity());

        try {

            Portfolio portfolio = PortfolioManager.getInstance().getPortfolio();
            int parentAccountId = (Integer)portfolio.getParentAccount().getID();
            int childAccountId = PortfolioManager.getInstance().getSelectedChild().getID();
            int goalId = PortfolioManager.getInstance().getSelectedChild().getSelectedGoal().getID();
            Chore chore = PortfolioManager.getInstance().getPortfolio().getChores().get(i);

            TransferModel transferModel = new TransferModel();
            transferModel.setFromAccountId(parentAccountId);
            transferModel.setToAccountId(childAccountId);
            transferModel.setAmount(chore.getAmount());
            transferModel.setGoalId(goalId);

            portfolioRequest.post("http://192.168.0.108:9810/api/transfer", transferModel, new TransferResponseHandler(this.getActivity()));

        } catch (JSONException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        Toast.makeText(this.getActivity(), "Making payment...", Toast.LENGTH_LONG ).show();
    }
}
