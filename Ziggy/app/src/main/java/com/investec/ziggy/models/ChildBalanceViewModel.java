package com.investec.ziggy.models;

/**
 * Created by Theodore.Koopman on 2016/12/02.
 */

public class ChildBalanceViewModel {
    public ChildBalanceViewModel() {

    }

    public ChildBalanceViewModel(String name, String balance, String photo) {
        this.setName(name);
        this.setBalance(balance);
        this.setPhoto(photo);
    }

    private String name;
    private String balance;
    private String photo;

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
