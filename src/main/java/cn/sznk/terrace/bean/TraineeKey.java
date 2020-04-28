package cn.sznk.terrace.bean;

import java.util.Date;

public class TraineeKey {
    private String traineecode;

    private Date updateTime;

    public String getTraineecode() {
        return traineecode;
    }

    public void setTraineecode(String traineecode) {
        this.traineecode = traineecode == null ? null : traineecode.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}