package com.bosssoft.bes.basedata.center.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import javax.persistence.Id;
import java.util.Date;

/**
 * 表中共有字段
 * @author xiaoyouming
 * @version 1.0
 * @since 2019-08-12
 */
public class CommonField {
    /**
     * 机构id
     */
    @JsonSerialize(using = ToStringSerializer.class)
    protected Long orgId;
    /**
     * 机构下公司id
     */
    @JsonSerialize(using = ToStringSerializer.class)
    protected Long companyId;
    /**
     * 通过id到数据字典中查询创建者
     */
    @JsonSerialize(using = ToStringSerializer.class)
    protected Long createdBy;
    /**
     * 创建日期
     */
    protected Date createdTime;
    /**
     * 通过id到数据字典中查询修改者
     */
    @JsonSerialize(using = ToStringSerializer.class)
    protected Long updatedBy;
    /**
     * 修改日期
     */
    protected Date updatedTime;
    /**
     * 版本，为Date.getTime()
     */
    @JsonSerialize(using = ToStringSerializer.class)
    protected Long version;

    public CommonField() {
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Long getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public CommonField(Long orgId, Long companyId, Long createdBy, Date createdTime, Long updatedBy, Date updatedTime, Long version) {
        this.orgId = orgId;
        this.companyId = companyId;
        this.createdBy = createdBy;
        this.createdTime = createdTime;
        this.updatedBy = updatedBy;
        this.updatedTime = updatedTime;
        this.version = version;
    }

    @Override
    public String toString() {
        return "CommonField{" +
                "orgId=" + orgId +
                ", companyId=" + companyId +
                ", createdBy=" + createdBy +
                ", createdTime=" + createdTime +
                ", updatedBy=" + updatedBy +
                ", updatedTime=" + updatedTime +
                ", version=" + version +
                '}';
    }
}
