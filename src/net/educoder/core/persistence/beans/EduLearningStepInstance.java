package net.educoder.core.persistence.beans;

import java.util.Date;

public class EduLearningStepInstance {
    private Long id;

    private Long stepId;

    private Long userId;

    private Boolean state;

    private String choiceStepUserChoice;

    private Date createTime;

    private Date updateTime;

    private String ideStepUserCode;

    private String ideStepUserOutput;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStepId() {
        return stepId;
    }

    public void setStepId(Long stepId) {
        this.stepId = stepId;
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

    public String getChoiceStepUserChoice() {
        return choiceStepUserChoice;
    }

    public void setChoiceStepUserChoice(String choiceStepUserChoice) {
        this.choiceStepUserChoice = choiceStepUserChoice == null ? null : choiceStepUserChoice.trim();
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

    public String getIdeStepUserCode() {
        return ideStepUserCode;
    }

    public void setIdeStepUserCode(String ideStepUserCode) {
        this.ideStepUserCode = ideStepUserCode == null ? null : ideStepUserCode.trim();
    }

    public String getIdeStepUserOutput() {
        return ideStepUserOutput;
    }

    public void setIdeStepUserOutput(String ideStepUserOutput) {
        this.ideStepUserOutput = ideStepUserOutput == null ? null : ideStepUserOutput.trim();
    }
}