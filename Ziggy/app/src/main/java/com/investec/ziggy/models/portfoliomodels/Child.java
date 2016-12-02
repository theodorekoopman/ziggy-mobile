
package com.investec.ziggy.models.portfoliomodels;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Child {

    private String name;
    private Integer age;
    private Integer balance;
    private String photoid;
    private List<Goal> goals = new ArrayList<Goal>();
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
     *     The age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 
     * @param age
     *     The age
     */
    public void setAge(Integer age) {
        this.age = age;
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
     *     The photoid
     */
    public String getPhotoid() {
        return photoid;
    }

    /**
     * 
     * @param photoid
     *     The photoid
     */
    public void setPhotoid(String photoid) {
        this.photoid = photoid;
    }

    /**
     * 
     * @return
     *     The goals
     */
    public List<Goal> getGoals() {
        return goals;
    }

    /**
     * 
     * @param goals
     *     The goals
     */
    public void setGoals(List<Goal> goals) {
        this.goals = goals;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
