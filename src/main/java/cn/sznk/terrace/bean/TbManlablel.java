package cn.sznk.terrace.bean;

public class TbManlablel {
    private Integer id;

    private String labelType;

    private Integer labelId;

    private String userId;

    private String userName;

    private String labelName;

    private Integer idioctonia;

    private Integer getaway;

    private Integer commitmurder;

    private Integer suddendeath;

    private String proposal;

    private String level;

    private String deptCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLabelType() {
        return labelType;
    }

    public void setLabelType(String labelType) {
        this.labelType = labelType == null ? null : labelType.trim();
    }

    public Integer getLabelId() {
        return labelId;
    }

    public void setLabelId(Integer labelId) {
        this.labelId = labelId;
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

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName == null ? null : labelName.trim();
    }

    public Integer getIdioctonia() {
        return idioctonia;
    }

    public void setIdioctonia(Integer idioctonia) {
        this.idioctonia = idioctonia;
    }

    public Integer getGetaway() {
        return getaway;
    }

    public void setGetaway(Integer getaway) {
        this.getaway = getaway;
    }

    public Integer getCommitmurder() {
        return commitmurder;
    }

    public void setCommitmurder(Integer commitmurder) {
        this.commitmurder = commitmurder;
    }

    public Integer getSuddendeath() {
        return suddendeath;
    }

    public void setSuddendeath(Integer suddendeath) {
        this.suddendeath = suddendeath;
    }

    public String getProposal() {
        return proposal;
    }

    public void setProposal(String proposal) {
        this.proposal = proposal == null ? null : proposal.trim();
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode == null ? null : deptCode.trim();
    }
}