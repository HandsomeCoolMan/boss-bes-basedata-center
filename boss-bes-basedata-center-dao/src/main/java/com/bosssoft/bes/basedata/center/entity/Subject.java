package com.bosssoft.bes.basedata.center.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import common.CommonField;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import java.io.Serializable;
import java.util.Date;

/**
 * t_subject
 * @author 
 */
@Table(name="t_subject")
public class Subject extends CommonField implements Serializable {

    /**
     * 题目类型id
     */
    @JsonSerialize(using = ToStringSerializer.class)
    private Long subjectTypeId;

    /**
     * 题目类别id
     */
    @JsonSerialize(using = ToStringSerializer.class)
    private Long categoryId;

    /**
     * 题目
     */
    private String name;

    /**
     * 难度
     */
    @JsonSerialize(using = ToStringSerializer.class)
    private Long difficulty;

    /**
     * 状态位
     */
    @Max(2)
    private Byte status;

    /**
     * 预留
     */
    private String field1;

    /**
     * 预留
     */
    private String field2;

    /**
     * 预留
     */
    private String field3;

    private static final long serialVersionUID = 1L;

    public Long getSubjectTypeId() {
        return subjectTypeId;
    }

    public void setSubjectTypeId(Long subjectTypeId) {
        this.subjectTypeId = subjectTypeId;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

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

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public String getField3() {
        return field3;
    }

    public void setField3(String field3) {
        this.field3 = field3;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectTypeId=" + subjectTypeId +
                ", categoryId=" + categoryId +
                ", name='" + name + '\'' +
                ", difficulty=" + difficulty +
                ", status=" + status +
                ", field1='" + field1 + '\'' +
                ", field2='" + field2 + '\'' +
                ", field3='" + field3 + '\'' +
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