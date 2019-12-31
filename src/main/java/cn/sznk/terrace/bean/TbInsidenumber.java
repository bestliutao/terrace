package cn.sznk.terrace.bean;

public class TbInsidenumber {
    private Integer id;

    private String totalnumber;

    private String entrynumber;

    private String outnumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTotalnumber() {
        return totalnumber;
    }

    public void setTotalnumber(String totalnumber) {
        this.totalnumber = totalnumber == null ? null : totalnumber.trim();
    }

    public String getEntrynumber() {
        return entrynumber;
    }

    public void setEntrynumber(String entrynumber) {
        this.entrynumber = entrynumber == null ? null : entrynumber.trim();
    }

    public String getOutnumber() {
        return outnumber;
    }

    public void setOutnumber(String outnumber) {
        this.outnumber = outnumber == null ? null : outnumber.trim();
    }
}