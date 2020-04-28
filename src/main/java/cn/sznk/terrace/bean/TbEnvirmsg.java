package cn.sznk.terrace.bean;

import java.util.Date;

public class TbEnvirmsg {
    private String envirOid;

    private String envirDesc;

    private String envirValue;

    private String envirLevel;

    private String envirType;

    private Date envirTime;

    private String envirStatus;

    private String deptCode;

    public String getEnvirOid() {
        return envirOid;
    }

    public void setEnvirOid(String envirOid) {
        this.envirOid = envirOid == null ? null : envirOid.trim();
    }

    public String getEnvirDesc() {
        return envirDesc;
    }

    public void setEnvirDesc(String envirDesc) {
        this.envirDesc = envirDesc == null ? null : envirDesc.trim();
    }

    public String getEnvirValue() {
        return envirValue;
    }

    public void setEnvirValue(String envirValue) {
        this.envirValue = envirValue == null ? null : envirValue.trim();
    }

    public String getEnvirLevel() {
        return envirLevel;
    }

    public void setEnvirLevel(String envirLevel) {
        this.envirLevel = envirLevel == null ? null : envirLevel.trim();
    }

    public String getEnvirType() {
        return envirType;
    }

    public void setEnvirType(String envirType) {
        this.envirType = envirType == null ? null : envirType.trim();
    }

    public Date getEnvirTime() {
        return envirTime;
    }

    public void setEnvirTime(Date envirTime) {
        this.envirTime = envirTime;
    }

    public String getEnvirStatus() {
        return envirStatus;
    }

    public void setEnvirStatus(String envirStatus) {
        this.envirStatus = envirStatus == null ? null : envirStatus.trim();
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode == null ? null : deptCode.trim();
    }
}