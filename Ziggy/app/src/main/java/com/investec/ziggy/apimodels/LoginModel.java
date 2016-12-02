package com.investec.ziggy.apimodels;

/**
 * Created by Theodore.Koopman on 2016/12/02.
 */

public class LoginModel {

    public LoginModel() {

    }



    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
