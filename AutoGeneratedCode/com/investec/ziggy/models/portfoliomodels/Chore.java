
package com.investec.ziggy.models.portfoliomodels;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Chore {

    @SerializedName("Repeat")
    @Expose
    private Integer repeat;
    @SerializedName("ID")
    @Expose
    private Integer iD;
    @SerializedName("Task")
    @Expose
    private String task;
    @SerializedName("Amount")
    @Expose
    private Integer amount;
    @SerializedName("AccID")
    @Expose
    private Integer accID;
    @SerializedName("PicturePath")
    @Expose
    private String picturePath;

    /**
     * 
     * @return
     *     The repeat
     */
    public Integer getRepeat() {
        return repeat;
    }

    /**
     * 
     * @param repeat
     *     The Repeat
     */
    public void setRepeat(Integer repeat) {
        this.repeat = repeat;
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
     *     The task
     */
    public String getTask() {
        return task;
    }

    /**
     * 
     * @param task
     *     The Task
     */
    public void setTask(String task) {
        this.task = task;
    }

    /**
     * 
     * @return
     *     The amount
     */
    public Integer getAmount() {
        return amount;
    }

    /**
     * 
     * @param amount
     *     The Amount
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * 
     * @return
     *     The accID
     */
    public Integer getAccID() {
        return accID;
    }

    /**
     * 
     * @param accID
     *     The AccID
     */
    public void setAccID(Integer accID) {
        this.accID = accID;
    }

    /**
     * 
     * @return
     *     The picturePath
     */
    public String getPicturePath() {
        return picturePath;
    }

    /**
     * 
     * @param picturePath
     *     The PicturePath
     */
    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
    }

}
