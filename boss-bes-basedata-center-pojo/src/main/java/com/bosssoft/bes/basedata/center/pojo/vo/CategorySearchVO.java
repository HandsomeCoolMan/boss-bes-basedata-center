package com.bosssoft.bes.basedata.center.pojo.vo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import javax.persistence.Id;
import java.io.Serializable;

public class CategorySearchVO implements Serializable {


    private static final long serialVersionUID = 1543296474324213705L;
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
        return "CategorySearchVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
