package com.investec.ziggy.handlers;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import com.investec.ziggy.BalanceActivity;
import com.investec.ziggy.common.PortfolioManager;
import com.investec.ziggy.models.portfoliomodels.Portfolio;

import cz.msebera.android.httpclient.Header;

/**
 * Created by theodore.koopman on 2016/12/09.
 */

public class DataRefreshHandler extends BaseResponseHandler<Portfolio> {
    public DataRefreshHandler(Context context) {
        super(context, Portfolio.class);
    }

    @Override
    public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
        super.onSuccess(statusCode, headers, responseBody);
        PortfolioManager.getInstance().enableLoginButton();

        if( !this.getResponseText().contains("User not found or password incorrect") ) {
            Toast.makeText(this.getActivity(), "Payment completed.", Toast.LENGTH_LONG).show();
            PortfolioManager.getInstance().setPortfolio(this.getInstance());

            Intent intent = new Intent(this.getActivity(), BalanceActivity.class);
            this.getActivity().startActivity(intent);
        }
        else {
            Toast.makeText(this.getActivity(), "Unable to get balance update.", Toast.LENGTH_LONG).show();
        }

    }


    @Override
    public void onFailure(int statusCode, Header[] headers, byte[] errorResponse, Throwable e) {
        Toast.makeText(this.getActivity(), "Oops something went wrong, please try again.", Toast.LENGTH_LONG).show();
        PortfolioManager.getInstance().enableLoginButton();
    }
}
