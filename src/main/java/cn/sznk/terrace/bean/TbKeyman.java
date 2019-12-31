package cn.sznk.terrace.bean;

public class TbKeyman {
    private String userId;

    private String userName;

    private String userHazard;

    private String userLevel;

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

    public String getUserHazard() {
        return userHazard;
    }

    public void setUserHazard(String userHazard) {
        this.userHazard = userHazard == null ? null : userHazard.trim();
    }

    public String getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(String userLevel) {
        this.userLevel = userLevel == null ? null : userLevel.trim();
    }

    @Override
    public String toString() {
        return "TbKeyman{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", userHazard='" + userHazard + '\'' +
                ", userLevel='" + userLevel + '\'' +
                '}';
    }
}