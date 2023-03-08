package net.educoder.core.persistence.beans;

import java.util.Date;

public class EduChallengeInstance {
    private Long id;

    private Long challengeId;

    private Long userId;

    private Boolean state;

    private Boolean explainState;

    private Integer explainPosition;

    private Boolean practiceState;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getChallengeId() {
        return challengeId;
    }

    public void setChallengeId(Long challengeId) {
        this.challengeId = challengeId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public Boolean getExplainState() {
        return explainState;
    }

    public void setExplainState(Boolean explainState) {
        this.explainState = explainState;
    }

    public Integer getExplainPosition() {
        return explainPosition;
    }

    public void setExplainPosition(Integer explainPosition) {
        this.explainPosition = explainPosition;
    }

    public Boolean getPracticeState() {
        return practiceState;
    }

    public void setPracticeState(Boolean practiceState) {
        this.practiceState = practiceState;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}