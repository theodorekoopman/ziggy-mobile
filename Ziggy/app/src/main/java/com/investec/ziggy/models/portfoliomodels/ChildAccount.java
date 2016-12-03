
package com.investec.ziggy.models.portfoliomodels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ChildAccount {

    @SerializedName("SelectedGoal")
    @Expose
    private SelectedGoal selectedGoal;
    @SerializedName("ID")
    @Expose
    private Integer iD;
    @SerializedName("AccountNumber")
    @Expose
    private Integer accountNumber;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("UserName")
    @Expose
    private String userName;
    @SerializedName("Password")
    @Expose
    private String password;
    @SerializedName("Balance")
    @Expose
    private Integer balance;
    @SerializedName("ParentAccountID")
    @Expose
    private Integer parentAccountID;

    /**
     * 
     * @return
     *     The selectedGoal
     */
    public SelectedGoal getSelectedGoal() {
        return selectedGoal;
    }

    /**
     * 
     * @param selectedGoal
     *     The SelectedGoal
     */
    public void setSelectedGoal(SelectedGoal selectedGoal) {
        this.selectedGoal = selectedGoal;
    }

    /**
     * 
     * @return
     *     The iD
     */
    public Integer getID() {
        return iD;
    }

    /**
     * 
     * @param iD
     *     The ID
     */
    public void setID(Integer iD) {
        this.iD = iD;
    }

    /**
     * 
     * @return
     *     The accountNumber
     */
    public Integer getAccountNumber() {
        return accountNumber;
    }

    /**
     * 
     * @param accountNumber
     *     The AccountNumber
     */
    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The Name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 
     * @param userName
     *     The UserName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 
     * @return
     *     The password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 
     * @param password
     *     The Password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 
     * @return
     *     The balance
     */
    public Integer getBalance() {
        return balance;
    }

    /**
     * 
     * @param balance
     *     The Balance
     */
    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    /**
     * 
     * @return
     *     The parentAccountID
     */
    public Integer getParentAccountID() {
        return parentAccountID;
    }

    /**
     * 
     * @param parentAccountID
     *     The ParentAccountID
     */
    public void setParentAccountID(Integer parentAccountID) {
        this.parentAccountID = parentAccountID;
    }

}
