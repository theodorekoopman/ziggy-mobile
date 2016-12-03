
package com.investec.ziggy.models.portfoliomodels;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class SelectedGoal {

    @SerializedName("ID")
    @Expose
    private Integer iD;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("AccID")
    @Expose
    private Integer accID;
    @SerializedName("GoalTargetAmount")
    @Expose
    private Integer goalTargetAmount;
    @SerializedName("GoalCurrentBalance")
    @Expose
    private Integer goalCurrentBalance;
    @SerializedName("PicturePath")
    @Expose
    private String picturePath;

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
     *     The goalTargetAmount
     */
    public Integer getGoalTargetAmount() {
        return goalTargetAmount;
    }

    /**
     * 
     * @param goalTargetAmount
     *     The GoalTargetAmount
     */
    public void setGoalTargetAmount(Integer goalTargetAmount) {
        this.goalTargetAmount = goalTargetAmount;
    }

    /**
     * 
     * @return
     *     The goalCurrentBalance
     */
    public Integer getGoalCurrentBalance() {
        return goalCurrentBalance;
    }

    /**
     * 
     * @param goalCurrentBalance
     *     The GoalCurrentBalance
     */
    public void setGoalCurrentBalance(Integer goalCurrentBalance) {
        this.goalCurrentBalance = goalCurrentBalance;
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
