package com.bosssoft.bes.basedata.center.service.impl;

import com.bosssoft.bes.basedata.center.dao.DictionaryMapper;
import com.bosssoft.bes.basedata.center.entity.Dictionary;
import com.bosssoft.bes.basedata.center.pojo.exception.BusinessException;
import com.bosssoft.bes.basedata.center.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DictionaryServiceImpl implements DictionaryService<Dictionary>  {

    @Autowired
    private DictionaryMapper dictionaryMapper;

    @Override
    public int add(Dictionary object) {
        return dictionaryMapper.insert(object);
    }

    @Override
    public int delete(Dictionary dictionary) {
        try {
            return dictionaryMapper.delete(dictionary);
        } catch (Exception e) {
            throw  new BusinessException(e.getMessage(),e,"10003");
        }
    }

    @Override
    public int update(Dictionary dictionary) {
        try {
            System.out.println(dictionary.toString());
            return dictionaryMapper.updateByPrimaryKeySelective(dictionary);
        } catch (Exception e) {
            throw  new BusinessException(e.getMessage(),e,"10003");
        }
    }

    @Override
    public List<Dictionary> findByConditon(Dictionary dictionary) {
        try {
            return dictionaryMapper.select(dictionary);
        } catch (Exception e) {
            throw  new BusinessException(e.getMessage(),e,"10004");
        }
    }

}
