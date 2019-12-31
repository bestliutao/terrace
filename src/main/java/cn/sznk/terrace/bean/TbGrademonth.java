package cn.sznk.terrace.bean;

public class TbGrademonth {
    private Integer id;

    private String statge;

    private String time;

    private String userId;

    private String userName;

    private String userGrade;

    private String gradePoor;

    private String zsjlGrade;

    private String jdkfGrade;

    private String jyxx;

    private String shws;

    private String xynd;

    private String tbjc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatge() {
        return statge;
    }

    public void setStatge(String statge) {
        this.statge = statge == null ? null : statge.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
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

    public String getUserGrade() {
        return userGrade;
    }

    public void setUserGrade(String userGrade) {
        this.userGrade = userGrade == null ? null : userGrade.trim();
    }

    public String getGradePoor() {
        return gradePoor;
    }

    public void setGradePoor(String gradePoor) {
        this.gradePoor = gradePoor == null ? null : gradePoor.trim();
    }

    public String getZsjlGrade() {
        return zsjlGrade;
    }

    public void setZsjlGrade(String zsjlGrade) {
        this.zsjlGrade = zsjlGrade == null ? null : zsjlGrade.trim();
    }

    public String getJdkfGrade() {
        return jdkfGrade;
    }

    public void setJdkfGrade(String jdkfGrade) {
        this.jdkfGrade = jdkfGrade == null ? null : jdkfGrade.trim();
    }

    public String getJyxx() {
        return jyxx;
    }

    public void setJyxx(String jyxx) {
        this.jyxx = jyxx == null ? null : jyxx.trim();
    }

    public String getShws() {
        return shws;
    }

    public void setShws(String shws) {
        this.shws = shws == null ? null : shws.trim();
    }

    public String getXynd() {
        return xynd;
    }

    public void setXynd(String xynd) {
        this.xynd = xynd == null ? null : xynd.trim();
    }

    public String getTbjc() {
        return tbjc;
    }

    public void setTbjc(String tbjc) {
        this.tbjc = tbjc == null ? null : tbjc.trim();
    }
}