package cn.sznk.terrace.bean;

public class EnvirOid {
    private String oid;

    private String varName;

    private String varDesc;

    private Double minValue;

    private Double initValue;

    private Double maxValue;

    private Double lowerBound;

    private Double upperBound;

    private Double normalValue;

    private String ip;

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid == null ? null : oid.trim();
    }

    public String getVarName() {
        return varName;
    }

    public void setVarName(String varName) {
        this.varName = varName == null ? null : varName.trim();
    }

    public String getVarDesc() {
        return varDesc;
    }

    public void setVarDesc(String varDesc) {
        this.varDesc = varDesc == null ? null : varDesc.trim();
    }

    public Double getMinValue() {
        return minValue;
    }

    public void setMinValue(Double minValue) {
        this.minValue = minValue;
    }

    public Double getInitValue() {
        return initValue;
    }

    public void setInitValue(Double initValue) {
        this.initValue = initValue;
    }

    public Double getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(Double maxValue) {
        this.maxValue = maxValue;
    }

    public Double getLowerBound() {
        return lowerBound;
    }

    public void setLowerBound(Double lowerBound) {
        this.lowerBound = lowerBound;
    }

    public Double getUpperBound() {
        return upperBound;
    }

    public void setUpperBound(Double upperBound) {
        this.upperBound = upperBound;
    }

    public Double getNormalValue() {
        return normalValue;
    }

    public void setNormalValue(Double normalValue) {
        this.normalValue = normalValue;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }
}