package com.bosssoft.bes.basedata.center.pojo.vo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import javax.persistence.Id;
import javax.validation.constraints.Max;
import java.io.Serializable;
import java.util.Date;

/**
 * 题目类型VO
 * @author
 */
public class SubjectTypeSearchVO implements Serializable {


    private static final long serialVersionUID = 9175203743221318209L;
    /**
     * 题目类型id
     */
    @Id
    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;

    /**
     * 题目类型
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
        return "SubjectTypeSearchVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
