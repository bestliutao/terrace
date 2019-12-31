package cn.sznk.terrace.bean;

public class TbLabellib {
    private Integer id;

    private String type;

    private String name;

    private Integer idioctonia;

    private Integer getaway;

    private Integer commitmurder;

    private Integer suddendeath;

    private String termvalidity;

    private Integer frequency;

    private String proposal;

    private String level;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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

    public String getTermvalidity() {
        return termvalidity;
    }

    public void setTermvalidity(String termvalidity) {
        this.termvalidity = termvalidity == null ? null : termvalidity.trim();
    }

    public Integer getFrequency() {
        return frequency;
    }

    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
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
}