
package com.investec.ziggy.models.portfoliomodels;

import java.util.HashMap;
import java.util.Map;

public class Chore {

    private String name;
    private Integer value;
    private String photoid;
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

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
