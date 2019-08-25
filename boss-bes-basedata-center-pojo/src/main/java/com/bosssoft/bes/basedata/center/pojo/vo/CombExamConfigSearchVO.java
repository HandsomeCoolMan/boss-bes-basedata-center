package com.bosssoft.bes.basedata.center.pojo.vo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import javax.persistence.Id;
import javax.validation.constraints.Max;
import java.io.Serializable;
import java.util.Date;

/**
 * 组卷配置VO
 * @author
 */
public class CombExamConfigSearchVO implements Serializable {


    private static final long serialVersionUID = -451360264997490997L;
    /**
     * 组卷配置id
     */
    @Id
    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;

    /**
     * 组卷配置名
     */
    private String name;

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

    @Override
    public String toString() {
        return "CombExamConfigSearchVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
