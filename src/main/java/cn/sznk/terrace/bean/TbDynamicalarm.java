package cn.sznk.terrace.bean;

import java.util.Date;

public class TbDynamicalarm {
    private Integer alarmId;

    private Date alarmTime;

    private Integer alarmState;

    private String alarmTitle;

    private String alarmDetils;

    private String alarmLevel;

    private String alarmGroup;

    private String alarmArea;

    private Integer alarmType;

    private String deptCode;

    public Integer getAlarmId() {
        return alarmId;
    }

    public void setAlarmId(Integer alarmId) {
        this.alarmId = alarmId;
    }

    public Date getAlarmTime() {
        return alarmTime;
    }

    public void setAlarmTime(Date alarmTime) {
        this.alarmTime = alarmTime;
    }

    public Integer getAlarmState() {
        return alarmState;
    }

    public void setAlarmState(Integer alarmState) {
        this.alarmState = alarmState;
    }

    public String getAlarmTitle() {
        return alarmTitle;
    }

    public void setAlarmTitle(String alarmTitle) {
        this.alarmTitle = alarmTitle == null ? null : alarmTitle.trim();
    }

    public String getAlarmDetils() {
        return alarmDetils;
    }

    public void setAlarmDetils(String alarmDetils) {
        this.alarmDetils = alarmDetils == null ? null : alarmDetils.trim();
    }

    public String getAlarmLevel() {
        return alarmLevel;
    }

    public void setAlarmLevel(String alarmLevel) {
        this.alarmLevel = alarmLevel == null ? null : alarmLevel.trim();
    }

    public String getAlarmGroup() {
        return alarmGroup;
    }

    public void setAlarmGroup(String alarmGroup) {
        this.alarmGroup = alarmGroup == null ? null : alarmGroup.trim();
    }

    public String getAlarmArea() {
        return alarmArea;
    }

    public void setAlarmArea(String alarmArea) {
        this.alarmArea = alarmArea == null ? null : alarmArea.trim();
    }

    public Integer getAlarmType() {
        return alarmType;
    }

    public void setAlarmType(Integer alarmType) {
        this.alarmType = alarmType;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode == null ? null : deptCode.trim();
    }
}