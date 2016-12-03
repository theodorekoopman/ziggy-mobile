package com.investec.ziggy.apimodels;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Theodore.Koopman on 2016/12/03.
 */
//{"fromaccountid":3, "toaccountid" : 4, "amount": 100, "goalid": 2}
public class TransferModel {

    public TransferModel() {

    }

    public TransferModel( int fromAccountId, int toAccountId, float amount, int goalId ) {
        this.setAmount(amount);
        this.setFromAccountId(fromAccountId);
        this.setToAccountId(toAccountId);
        this.setGoalId(goalId);
    }

    @SerializedName("fromaccountid")
    private int fromAccountId;
    @SerializedName("toaccountid")
    private int toAccountId;
    @SerializedName("amount")
    private float amount;
    @SerializedName("goalid")
    private int goalId;

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public int getFromAccountId() {
        return fromAccountId;
    }

    public void setFromAccountId(int fromAccountId) {
        this.fromAccountId = fromAccountId;
    }

    public int getToAccountId() {
        return toAccountId;
    }

    public void setToAccountId(int toAccountId) {
        this.toAccountId = toAccountId;
    }

    public int getGoalId() {
        return goalId;
    }

    public void setGoalId(int goalId) {
        this.goalId = goalId;
    }
}
