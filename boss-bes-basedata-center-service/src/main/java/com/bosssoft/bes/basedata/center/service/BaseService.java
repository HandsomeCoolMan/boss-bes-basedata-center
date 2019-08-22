package com.bosssoft.bes.basedata.center.service;

import java.util.List;

public interface  BaseService<T>{

    /**
     * 基础添加业务
     */
    int save(T object);
    /**
     * 基础删除业务
     */
    int delete(T object);
    /**
     * 基础更新业务
     */
    int update(T object);
    /**
     * 基础查询业务
     */
    List<T> query(T object);
}
