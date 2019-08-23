package com.bosssoft.bes.basedata.center.service.impl;

import annotations.EnumOperation;
import annotations.FullCommonField;
import com.bosssoft.bes.basedata.center.dao.DictionaryMapper;
import com.bosssoft.bes.basedata.center.entity.Dictionary;
import com.bosssoft.bes.basedata.center.pojo.dto.DictionaryDTO;
import com.bosssoft.bes.basedata.center.service.DictionaryService;
import exception.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import utils.Converter;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author
 */
@Service
public class DictionaryServiceImpl  implements DictionaryService<DictionaryDTO,DictionaryDTO>  {

    @Autowired
    private DictionaryMapper dictionaryMapper;

    private Dictionary dictionary = new Dictionary();

    private DictionaryDTO dictionaryDTO = new DictionaryDTO();

    @Autowired
    Converter converter;
    /**
     * @Transactional 表示事务开启
     *
     * @param dictionaryDTO
     * @return: int
     */
    @Override
    @Transactional(rollbackFor = SQLException.class)
    @FullCommonField(dataCenterId = 1, machineId = 2, operation = EnumOperation.INSERT)
    public boolean save(DictionaryDTO dictionaryDTO, String token) {
        converter.copyProperties(dictionaryDTO, dictionary);
        try{
            dictionaryMapper.insert(dictionary);
            return true;
        }catch (Exception e){
            throw  new BusinessException(10003,e.getMessage(),e);
        }
    }

    @Override
    @Transactional(rollbackFor = SQLException.class)
    public boolean deleteById(Long id) {
        try {
            dictionaryMapper.deleteByPrimaryKey(id);
            return true;
        } catch (Exception e) {
            throw  new BusinessException(10003,e.getMessage(),e);
        }
    }

    @Override
    @Transactional(rollbackFor = SQLException.class)
    @FullCommonField(dataCenterId = 1, machineId = 2, operation = EnumOperation.UPDATE)
    public boolean update(DictionaryDTO dictionaryDTO, String token) {
        converter.copyProperties(dictionaryDTO, dictionary);
        try {
            System.out.println(dictionaryMapper.updateByPrimaryKeySelective(dictionary));
            return true;
        } catch (Exception e) {
            throw  new BusinessException(10003,e.getMessage(),e);
        }
    }

    @Override
    @Transactional(rollbackFor = SQLException.class)
    public List<DictionaryDTO> query(DictionaryDTO dictionaryDTO) {
        List<DictionaryDTO> dictionaryDTOList = new ArrayList<>();
        converter.copyProperties(dictionaryDTO, dictionary);
        try {
            converter.copyProperties(dictionaryMapper.select(dictionary),dictionaryDTOList);
            return dictionaryDTOList;
        } catch (Exception e) {
            throw  new BusinessException(10003,e.getMessage(),e);
        }
    }

    @Override
    @Transactional(rollbackFor = SQLException.class)
    public DictionaryDTO queryById(Long id){
        try {
            converter.copyProperties(dictionaryMapper.selectByPrimaryKey(id),dictionaryDTO);
            return dictionaryDTO;
        } catch (Exception e) {
            throw  new BusinessException(10003,e.getMessage(),e);
        }
    }


}
