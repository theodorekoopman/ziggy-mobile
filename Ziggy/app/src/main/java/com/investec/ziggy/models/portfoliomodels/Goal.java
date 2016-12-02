
package com.investec.ziggy.models.portfoliomodels;

import java.util.HashMap;
import java.util.Map;

public class Goal {

    private String name;
    private Integer value;
    private String imageurl;
    private Integer goalbalance;
    private Integer goalpercent;
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
     *     The value
     */
    public Integer getValue() {
        return value;
    }

    /**
     * 
     * @param value
     *     The value
     */
    public void setValue(Integer value) {
        this.value = value;
    }

    /**
     * 
     * @return
     *     The imageurl
     */
    public String getImageurl() {
        return imageurl;
    }

    /**
     * 
     * @param imageurl
     *     The imageurl
     */
    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    /**
     * 
     * @return
     *     The goalbalance
     */
    public Integer getGoalbalance() {
        return goalbalance;
    }

    /**
     * 
     * @param goalbalance
     *     The goalbalance
     */
    public void setGoalbalance(Integer goalbalance) {
        this.goalbalance = goalbalance;
    }

    /**
     * 
     * @return
     *     The goalpercent
     */
    public Integer getGoalpercent() {
        return goalpercent;
    }

    /**
     * 
     * @param goalpercent
     *     The goalpercent
     */
    public void setGoalpercent(Integer goalpercent) {
        this.goalpercent = goalpercent;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
