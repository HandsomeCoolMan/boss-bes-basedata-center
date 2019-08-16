package com.bosssoft.bes.basedata.center.service;

import java.util.List;

public interface  BaseService<T>{
    int add(T object);
    int delete(T object);
    int update(T object);
    List<T> findByConditon(T object);
}
