package cn.sznk.terrace.bean;

import java.util.Date;

public class TbMonitorabnormal {
    private String monitorIp;

    private Date monitorTime;

    private Integer monitorState;

    private String monitorLevel;

    private String monitorGroup;

    private String monitorArea;

    private String monitorType;

    private String deptCode;

    public String getMonitorIp() {
        return monitorIp;
    }

    public void setMonitorIp(String monitorIp) {
        this.monitorIp = monitorIp == null ? null : monitorIp.trim();
    }

    public Date getMonitorTime() {
        return monitorTime;
    }

    public void setMonitorTime(Date monitorTime) {
        this.monitorTime = monitorTime;
    }

    public Integer getMonitorState() {
        return monitorState;
    }

    public void setMonitorState(Integer monitorState) {
        this.monitorState = monitorState;
    }

    public String getMonitorLevel() {
        return monitorLevel;
    }

    public void setMonitorLevel(String monitorLevel) {
        this.monitorLevel = monitorLevel == null ? null : monitorLevel.trim();
    }

    public String getMonitorGroup() {
        return monitorGroup;
    }

    public void setMonitorGroup(String monitorGroup) {
        this.monitorGroup = monitorGroup == null ? null : monitorGroup.trim();
    }

    public String getMonitorArea() {
        return monitorArea;
    }

    public void setMonitorArea(String monitorArea) {
        this.monitorArea = monitorArea == null ? null : monitorArea.trim();
    }

    public String getMonitorType() {
        return monitorType;
    }

    public void setMonitorType(String monitorType) {
        this.monitorType = monitorType == null ? null : monitorType.trim();
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode == null ? null : deptCode.trim();
    }
}