package com.bosssoft.bes.basedata.center.dao.domain;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * t_comb_exam_config_item
 * @author 
 */
public class CombExamConfigItem implements Serializable {
    /**
     * 组卷配置明细项ID
     */
    private Long combExamConfigItemId;

    /**
     * 题型ID
     */
    private Long subjectTypeId;

    /**
     * 组卷配置ID
     */
    private Long combExamId;

    /**
     * 题目类别ID
     */
    private Long categoryId;

    /**
     * 题目数量
     */
    private Integer num;

    /**
     * 题目难度
     */
    private Integer difficult;

    /**
     * 题目分值
     */
    private BigDecimal score;

    private static final long serialVersionUID = 1L;

    public Long getCombExamConfigItemId() {
        return combExamConfigItemId;
    }

    public void setCombExamConfigItemId(Long combExamConfigItemId) {
        this.combExamConfigItemId = combExamConfigItemId;
    }

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

    public Integer getDifficult() {
        return difficult;
    }

    public void setDifficult(Integer difficult) {
        this.difficult = difficult;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }
}