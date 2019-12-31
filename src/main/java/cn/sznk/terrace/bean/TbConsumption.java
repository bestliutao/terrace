package cn.sznk.terrace.bean;

import java.util.Date;

public class TbConsumption {
    private Integer consumptionId;

    private String userId;

    private String userName;

    private Integer consumptionMoney;

    private Date consumptionTime;

    public Integer getConsumptionId() {
        return consumptionId;
    }

    public void setConsumptionId(Integer consumptionId) {
        this.consumptionId = consumptionId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Integer getConsumptionMoney() {
        return consumptionMoney;
    }

    public void setConsumptionMoney(Integer consumptionMoney) {
        this.consumptionMoney = consumptionMoney;
    }

    public Date getConsumptionTime() {
        return consumptionTime;
    }

    public void setConsumptionTime(Date consumptionTime) {
        this.consumptionTime = consumptionTime;
    }
}