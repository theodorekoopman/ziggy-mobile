package com.investec.ziggy.listeners;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.investec.ziggy.BalanceActivity;
import com.investec.ziggy.LoginActivity;
import com.investec.ziggy.R;
import com.investec.ziggy.apimodels.LoginModel;
import com.investec.ziggy.common.BaseRest;
import com.investec.ziggy.common.PortfolioManager;
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
        EditText editText =  ((LoginActivity)getActivity()).getPassword();
        Button button = (Button)((LoginActivity)getActivity()).findViewById(R.id.login_button);
        button.setEnabled(false);
        String password = editText.getText().toString();

        PortfolioManager.getInstance().setLoginButton(button);
        PortfolioManager.getInstance().setPassword(password);
        PortfolioManager.getInstance().load(this.getActivity(),new LoginResponseHandler(this.getActivity()));
    }

    private Context getActivity() {
        return activity;
    }

    private void setActivity(Context activity) {
        this.activity = activity;
    }
}
