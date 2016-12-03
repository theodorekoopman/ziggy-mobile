
package com.investec.ziggy.models.portfoliomodels;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Portfolio {

    @SerializedName("ParentAccount")
    @Expose
    private ParentAccount parentAccount;
    @SerializedName("ChildAccounts")
    @Expose
    private List<ChildAccount> childAccounts = new ArrayList<ChildAccount>();
    @SerializedName("Chores")
    @Expose
    private List<Chore> chores = new ArrayList<Chore>();
    @SerializedName("ZiggyError")
    @Expose
    private Object ziggyError;

    /**
     * 
     * @return
     *     The parentAccount
     */
    public ParentAccount getParentAccount() {
        return parentAccount;
    }

    /**
     * 
     * @param parentAccount
     *     The ParentAccount
     */
    public void setParentAccount(ParentAccount parentAccount) {
        this.parentAccount = parentAccount;
    }

    /**
     * 
     * @return
     *     The childAccounts
     */
    public List<ChildAccount> getChildAccounts() {
        return childAccounts;
    }

    /**
     * 
     * @param childAccounts
     *     The ChildAccounts
     */
    public void setChildAccounts(List<ChildAccount> childAccounts) {
        this.childAccounts = childAccounts;
    }

    /**
     * 
     * @return
     *     The chores
     */
    public List<Chore> getChores() {
        return chores;
    }

    /**
     * 
     * @param chores
     *     The Chores
     */
    public void setChores(List<Chore> chores) {
        this.chores = chores;
    }

    /**
     * 
     * @return
     *     The ziggyError
     */
    public Object getZiggyError() {
        return ziggyError;
    }

    /**
     * 
     * @param ziggyError
     *     The ZiggyError
     */
    public void setZiggyError(Object ziggyError) {
        this.ziggyError = ziggyError;
    }

}
