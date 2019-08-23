package com.bosssoft.bes.basedata.center.pojo.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import javax.persistence.Id;
import javax.validation.constraints.Max;
import java.io.Serializable;
import java.util.Date;

/**
 * 题目DTO
 * @author pan
 */
public class SubjectDTO implements Serializable {
    private static final long serialVersionUID = 6193674149029494679L;
    /**
     * 题目类别id
     */
    @Id
    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;

    /**
     * 题目类别
     */
    private String name;

    /**
     * 备注
     */
    private String remark;

    /**
     * 更新时间
     */
    private Date updatedTime;

    /**
     * 状态位
     */
    @Max(2)
    private Integer status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "SubjectType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", remark='" + remark + '\'' +
                ", updatedTime=" + updatedTime +
                ", status=" + status +
                '}';
    }
}
