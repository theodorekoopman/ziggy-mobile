
package com.investec.ziggy.models.portfoliomodels;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Portfolio {

    private String name;
    private String accountNumber;
    private Integer balance;
    private List<Child> children = new ArrayList<Child>();
    private List<Chore> chores = new ArrayList<Chore>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The accountNumber
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * 
     * @param accountNumber
     *     The accountNumber
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
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
     *     The balance
     */
    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    /**
     * 
     * @return
     *     The children
     */
    public List<Child> getChildren() {
        return children;
    }

    /**
     * 
     * @param children
     *     The children
     */
    public void setChildren(List<Child> children) {
        this.children = children;
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
     *     The chores
     */
    public void setChores(List<Chore> chores) {
        this.chores = chores;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
