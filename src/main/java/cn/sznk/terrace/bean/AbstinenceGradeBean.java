package cn.sznk.terrace.bean;

import java.util.List;

public class AbstinenceGradeBean {
    private String type;
    private List<TitileNumBean> number;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<TitileNumBean> getNumber() {
        return number;
    }

    public void setNumber(List<TitileNumBean> number) {
        this.number = number;
    }
}
