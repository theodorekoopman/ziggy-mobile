
package com.investec.ziggy.models.portfoliomodels;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Portfolio {

    private ParentAccount parentAccount;
    private List<ChildAccount> childAccounts = new ArrayList<ChildAccount>();
    private Object chores;
    private Object ziggyError;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
    public Object getChores() {
        return chores;
    }

    /**
     * 
     * @param chores
     *     The Chores
     */
    public void setChores(Object chores) {
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

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
