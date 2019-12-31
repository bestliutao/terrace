package cn.sznk.terrace.bean;

public class TbTraineeimage {
    private String traineecode;

    private String traineeimage;

    public String getTraineecode() {
        return traineecode;
    }

    public void setTraineecode(String traineecode) {
        this.traineecode = traineecode == null ? null : traineecode.trim();
    }

    public String getTraineeimage() {
        return traineeimage;
    }

    public void setTraineeimage(String traineeimage) {
        this.traineeimage = traineeimage == null ? null : traineeimage.trim();
    }
}