package com.bosssoft.bes.basedata.center.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import common.CommonField;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 组卷配置明细实体
 * t_comb_exam_config_item表
 * @author
 */
@Table(name="t_comb_exam_config_item")
public class CombExamConfigItem extends CommonField implements Serializable {

    /**
     * 题型ID
     */
    @NotNull(message = "题目类别不能为空！")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long subjectTypeId;

    /**
     * 组卷配置ID
     */
    @NotNull(message = "题目类别不能为空！")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long combExamId;

    /**
     * 题目类别ID
     */
    @NotNull(message = "题目类别不能为空！")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long categoryId;

    /**
     * 题目数量
     */
    @NotNull(message = "题目类别不能为空！")
    private Integer num;

    /**
     * 题目难度
     */
    @NotNull(message = "题目类别不能为空！")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long difficult;

    /**
     * 题目分值
     */
    @NotNull(message = "题目类别不能为空！")
    private double score;

    private static final long serialVersionUID = 1L;

    public Long getSubjectTypeId() {
        return subjectTypeId;
    }

    public void setSubjectTypeId(Long subjectTypeId) {
        this.subjectTypeId = subjectTypeId;
    }

    public Long getCombExamId() {
        return combExamId;
    }

    public void setCombExamId(Long combExamId) {
        this.combExamId = combExamId;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Long getDifficult() {
        return difficult;
    }

    public void setDifficult(Long difficult) {
        this.difficult = difficult;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "CombExamConfigItem{" +
                "subjectTypeId=" + subjectTypeId +
                ", combExamId=" + combExamId +
                ", categoryId=" + categoryId +
                ", num=" + num +
                ", difficult=" + difficult +
                ", score=" + score +
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