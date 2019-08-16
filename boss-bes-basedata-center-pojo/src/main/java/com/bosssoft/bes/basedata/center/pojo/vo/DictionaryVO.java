package com.bosssoft.bes.basedata.center.pojo.vo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
/**
 * dictionaryDTO
 *
 * @Author: 谢良希
 * @Date: 2019/8/13
 * @Version: 1.0
 * @Maintenance Records:
 */
public class DictionaryVO implements Serializable {

    private static final long serialVersionUID = 6193674149029494679L;
    /**
     * 字典id
     */
    @Id
    @JsonSerialize(using = ToStringSerializer.class)
    private Long dictionaryId;
    /**
     * 字典名
     */
    @NotNull(message = "字典名不能为空！")
    private String name;
    /**
     * 字典类型
     */
    @NotNull(message = "字典类型不能为空！")
    private String category;
    /**
     * 字典值
     */
    @NotNull(message = "字典值不能为空！")
    private String value;
    /**
     * 更新时间
     */
    private Date updatedTime;
    /**
     * 备注
     */
    private String remark;
    /**
     * 状态
     */
    private Integer status;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getDictionaryId() {
        return dictionaryId;
    }

    public void setDictionaryId(Long dictionaryId) {
        this.dictionaryId = dictionaryId;
    }

    @Override
    public String toString() {
        return "DictionaryVO{" +
                "dictionaryId=" + dictionaryId +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", value='" + value + '\'' +
                ", updatedTime=" + updatedTime +
                ", remark='" + remark + '\'' +
                ", status=" + status +
                '}';
    }
}
