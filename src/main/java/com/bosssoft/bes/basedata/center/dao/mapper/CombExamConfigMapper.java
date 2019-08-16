package com.bosssoft.bes.basedata.center.dao.mapper;

import com.bosssoft.bes.basedata.center.dao.domain.CombExamConfig;
import com.bosssoft.bes.basedata.center.dao.example.CombExamConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CombExamConfigMapper {
    long countByExample(CombExamConfigExample example);

    int deleteByExample(CombExamConfigExample example);

    int deleteByPrimaryKey(Long combExamId);

    int insert(CombExamConfig record);

    int insertSelective(CombExamConfig record);

    List<CombExamConfig> selectByExample(CombExamConfigExample example);

    CombExamConfig selectByPrimaryKey(Long combExamId);

    int updateByExampleSelective(@Param("record") CombExamConfig record, @Param("example") CombExamConfigExample example);

    int updateByExample(@Param("record") CombExamConfig record, @Param("example") CombExamConfigExample example);

    int updateByPrimaryKeySelective(CombExamConfig record);

    int updateByPrimaryKey(CombExamConfig record);
}