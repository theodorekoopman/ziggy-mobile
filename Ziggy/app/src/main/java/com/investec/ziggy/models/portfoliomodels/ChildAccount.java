
package com.investec.ziggy.models.portfoliomodels;

import java.util.HashMap;
import java.util.Map;

public class ChildAccount {

    private Object selectedGoal;
    private Integer iD;
    private Integer accountNumber;
    private String name;
    private String userName;
    private String password;
    private Integer balance;
    private Integer parentAccountID;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The selectedGoal
     */
    public Object getSelectedGoal() {
        return selectedGoal;
    }

    /**
     * 
     * @param selectedGoal
     *     The SelectedGoal
     */
    public void setSelectedGoal(Object selectedGoal) {
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

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
