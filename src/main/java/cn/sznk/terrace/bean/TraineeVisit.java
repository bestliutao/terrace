package cn.sznk.terrace.bean;

import java.util.Date;

public class TraineeVisit {
    private String visitno;

    private Integer traineeid;

    private String traineecode;

    private String traineename;

    private String subordinateunit;

    private String visitname;

    private String visitrelation;

    private String idcardno;

    private String address;

    private String visitoraddress;

    private Date regdate;

    private Date updateTime;

    private String deptCode;

    public String getVisitno() {
        return visitno;
    }

    public void setVisitno(String visitno) {
        this.visitno = visitno == null ? null : visitno.trim();
    }

    public Integer getTraineeid() {
        return traineeid;
    }

    public void setTraineeid(Integer traineeid) {
        this.traineeid = traineeid;
    }

    public String getTraineecode() {
        return traineecode;
    }

    public void setTraineecode(String traineecode) {
        this.traineecode = traineecode == null ? null : traineecode.trim();
    }

    public String getTraineename() {
        return traineename;
    }

    public void setTraineename(String traineename) {
        this.traineename = traineename == null ? null : traineename.trim();
    }

    public String getSubordinateunit() {
        return subordinateunit;
    }

    public void setSubordinateunit(String subordinateunit) {
        this.subordinateunit = subordinateunit == null ? null : subordinateunit.trim();
    }

    public String getVisitname() {
        return visitname;
    }

    public void setVisitname(String visitname) {
        this.visitname = visitname == null ? null : visitname.trim();
    }

    public String getVisitrelation() {
        return visitrelation;
    }

    public void setVisitrelation(String visitrelation) {
        this.visitrelation = visitrelation == null ? null : visitrelation.trim();
    }

    public String getIdcardno() {
        return idcardno;
    }

    public void setIdcardno(String idcardno) {
        this.idcardno = idcardno == null ? null : idcardno.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getVisitoraddress() {
        return visitoraddress;
    }

    public void setVisitoraddress(String visitoraddress) {
        this.visitoraddress = visitoraddress == null ? null : visitoraddress.trim();
    }

    public Date getRegdate() {
        return regdate;
    }

    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode == null ? null : deptCode.trim();
    }
}