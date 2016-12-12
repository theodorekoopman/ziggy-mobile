package com.investec.ziggy.common;

import android.content.Context;
import android.widget.Button;
import android.widget.EditText;

import com.investec.ziggy.LoginActivity;
import com.investec.ziggy.apimodels.LoginModel;
import com.investec.ziggy.handlers.LoginResponseHandler;
import com.investec.ziggy.models.portfoliomodels.ChildAccount;
import com.investec.ziggy.models.portfoliomodels.Portfolio;
import com.loopj.android.http.AsyncHttpResponseHandler;

import org.json.JSONException;

import java.io.UnsupportedEncodingException;

/**
 * Created by Theodore.Koopman on 2016/12/03.
 */

public class PortfolioManager {
    private PortfolioManager() {
        this.setServerAddress("192.168.0.103:9810");
    }

    private static PortfolioManager instance;
    private Portfolio portfolio;
    private ChildAccount selectedChild;
    private String serverAddress;
    private String password;
    private Button loginButton;

    public static PortfolioManager getInstance() {
        if( instance == null ) {
            instance = new PortfolioManager();
        }
        return instance;
    }

    public void load(Context context, AsyncHttpResponseHandler handler) {
        BaseRest<LoginModel, Portfolio> portfolioRequest = new BaseRest<>(context);

        try {
            this.disableLoginButton();

            String username = "devendran";

            LoginModel loginModel = new LoginModel();
            loginModel.setUsername(username);
            loginModel.setPassword(this.getPassword());

            String address = "http://" + this.getServerAddress() + "/api/login";
            portfolioRequest.post(address, loginModel, handler);

        } catch (JSONException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public ChildAccount getSelectedChild() {
        return selectedChild;
    }

    public void setSelectedChild(ChildAccount selectedChild) {
        this.selectedChild = selectedChild;
    }

    public String getServerAddress() {
        if( serverAddress.isEmpty() ) {
            this.setServerAddress("192.168.0.103:9810");
        }
        return serverAddress;
    }

    public void setServerAddress(String serverAddress) {
        this.serverAddress = serverAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Button getLoginButton() {
        return loginButton;
    }

    public void setLoginButton(Button loginButton) {
        this.loginButton = loginButton;
    }

    public void disableLoginButton() {
        this.getLoginButton().setText("Please Wait...");
        this.getLoginButton().setEnabled(false);
    }

    public void enableLoginButton() {
        this.getLoginButton().setText("Login");
        this.getLoginButton().setEnabled(true);
    }
}
