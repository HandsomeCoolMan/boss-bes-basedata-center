package com.bosssoft.bes.basedata.center.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import common.CommonField;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * 组卷配置实体
 * t_comb_exam_config表
 *
 */
@Table(name="t_comb_exam_config")
public class CombExamConfig extends CommonField implements Serializable {

    private static final long serialVersionUID = 3187412730553408795L;

    /**
     * 配置名
     */
    @NotNull(message = "配置名不能为空！")
    private String name;

    /**
     * 备注
     */
    private String remark;

    /**
     * 标记位
     */
    @Max(2)
    private Byte status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "CombExamConfig{" +
                "name='" + name + '\'' +
                ", remark='" + remark + '\'' +
                ", status=" + status +
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