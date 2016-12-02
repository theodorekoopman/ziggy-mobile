package com.investec.ziggy.listeners;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;

import com.investec.ziggy.BalanceActivity;
import com.investec.ziggy.LoginActivity;
import com.investec.ziggy.R;
import com.investec.ziggy.apimodels.LoginModel;
import com.investec.ziggy.common.BaseRest;
import com.investec.ziggy.handlers.LoginResponseHandler;
import com.investec.ziggy.models.portfoliomodels.Portfolio;

import org.json.JSONException;

import java.io.UnsupportedEncodingException;

/**
 * Created by Theodore.Koopman on 2016/12/02.
 */

public class LoginButtonListener implements View.OnClickListener {
    public LoginButtonListener(Context context ) {
        this.setActivity(context);
    }

    private Context activity;

    @Override
    public void onClick(View view) {
        BaseRest<LoginModel, Portfolio> portfolioRequest = new BaseRest<>(this.getActivity());

        try {
            String username = "devendran";
            String password = "";

            EditText editText =  ((LoginActivity)getActivity()).getPassword();
            password = editText.getText().toString();

            LoginModel loginModel = new LoginModel();
            loginModel.setUsername(username);
            loginModel.setPassword(password);
            portfolioRequest.post("http://192.168.0.109:9810/api/login", loginModel, new LoginResponseHandler(this.getActivity()));

        } catch (JSONException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    private Context getActivity() {
        return activity;
    }

    private void setActivity(Context activity) {
        this.activity = activity;
    }
}
