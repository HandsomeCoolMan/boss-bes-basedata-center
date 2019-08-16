package com.bosssoft.bes.basedata.center.entity;

import javax.persistence.Table;
import java.io.Serializable;

@Table(name="t_subject_type")
public class SubjectType extends CommonField implements Serializable {
    private Long SubjectTypeId;
    private String name;
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
                ", createdBy=" + createdBy +
                ", createdTime=" + createdTime +
                ", updatedBy=" + updatedBy +
                ", updatedTime=" + updatedTime +
                ", version=" + version +
                '}';
    }
}
