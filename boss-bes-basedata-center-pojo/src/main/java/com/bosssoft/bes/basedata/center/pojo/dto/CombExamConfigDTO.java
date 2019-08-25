package com.bosssoft.bes.basedata.center.pojo.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import common.BaseDTO;
import common.CommonField;

import javax.persistence.Id;
import javax.validation.constraints.Max;
import java.io.Serializable;
import java.util.Date;

/**
 * 组卷配置DTO
 * @author pan
 */
public class CombExamConfigDTO extends BaseDTO implements Serializable {
    private static final long serialVersionUID = 6193674149029494679L;

    /**
     * 组卷配置名
     */
    private String name;

    /**
     * 试卷难度
     */
    @JsonSerialize(using = ToStringSerializer.class)
    private Long difficulty;

    /**
     * 状态位
     */
    @Max(2)
    private Integer status;

    @JsonSerialize(using = ToStringSerializer.class)
    private Long companyId;

    private String remark;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Long difficulty) {
        this.difficulty = difficulty;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "CombExamConfigDTO{" +
                "name='" + name + '\'' +
                ", difficulty=" + difficulty +
                ", status=" + status +
                ", companyId=" + companyId +
                ", remark='" + remark + '\'' +
                ", token='" + token + '\'' +
                ", id=" + id +
                ", orgId=" + orgId +
                ", companyId=" + companyId +
                ", createdBy=" + createdBy +
                ", createdTime=" + createdTime +
                ", updatedBy=" + updatedBy +
                ", updatedTime=" + updatedTime +
                ", version=" + version +
                '}';
    }
}
