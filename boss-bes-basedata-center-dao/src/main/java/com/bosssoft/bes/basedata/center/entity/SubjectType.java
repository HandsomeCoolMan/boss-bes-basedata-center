package com.bosssoft.bes.basedata.center.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import javax.persistence.Id;
import javax.validation.constraints.Max;
import java.io.Serializable;

/**
 * @author pan
 */
public class SubjectType extends CommonField implements Serializable {
    /**
     * 题目类型ID
     */
    @Id
    @JsonSerialize(using = ToStringSerializer.class)
    private Long SubjectTypeId;
    /**
     * 题目类型
     */
    private String name;
    /**
     * 状态位
     */
    @Max(2)
    private Byte status;

    public Long getSubjectTypeId() {
        return SubjectTypeId;
    }

    public void setSubjectTypeId(Long subjectTypeId) {
        SubjectTypeId = subjectTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "SubjectType{" +
                "SubjectTypeId=" + SubjectTypeId +
                ", name='" + name + '\'' +
                ", status=" + status +
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
