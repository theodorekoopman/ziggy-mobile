
package com.investec.ziggy.models.portfoliomodels;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class ParentAccount {

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
    private Object parentAccountID;

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
    public Object getParentAccountID() {
        return parentAccountID;
    }

    /**
     * 
     * @param parentAccountID
     *     The ParentAccountID
     */
    public void setParentAccountID(Object parentAccountID) {
        this.parentAccountID = parentAccountID;
    }

}
