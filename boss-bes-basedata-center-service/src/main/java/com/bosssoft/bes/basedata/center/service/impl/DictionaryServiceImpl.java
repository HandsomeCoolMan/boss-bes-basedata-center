package com.bosssoft.bes.basedata.center.service.impl;

import annotations.FullCommonField;
import com.bosssoft.bes.basedata.center.dao.DictionaryMapper;
import com.bosssoft.bes.basedata.center.entity.Dictionary;
import com.bosssoft.bes.basedata.center.service.DictionaryService;
import exception.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author
 */
@Service
public class DictionaryServiceImpl implements DictionaryService<Dictionary>  {

    @Autowired
    private DictionaryMapper dictionaryMapper;

    /**
     * @Transactional 表示事务开启
     *
     * @param object
     * @return: int
     */
    @Override
    @Transactional
    @FullCommonField(dataCenterId = 1, machineId = 2)
    public int add(Dictionary object) {
        try{
            return dictionaryMapper.insert(object);
        }catch (Exception e){
            e.printStackTrace();
        }
        return -1;
    }

    @Override
    public int delete(Dictionary dictionary) {
        try {
            return dictionaryMapper.delete(dictionary);
        } catch (Exception e) {
            //throw  new BusinessException(e.getMessage(),e,"10003");
        }
        return 0;
    }

    @Override
    public int update(Dictionary dictionary) {
        try {
            System.out.println(dictionary.toString());
            return dictionaryMapper.updateByPrimaryKeySelective(dictionary);
        } catch (Exception e) {
            //throw  new BusinessException(e.getMessage(),e,"10003");
        }
        return 0;
    }

    @Override
    public List<Dictionary> query(Dictionary dictionary) {
        try {
            return dictionaryMapper.select(dictionary);
        } catch (Exception e) {
           // throw  new BusinessException(e.getMessage(),e,"10004");
        }
        return null;
    }

}
