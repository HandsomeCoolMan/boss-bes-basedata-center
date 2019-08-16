package com.bosssoft.bes.basedata.center.dao.mapper;

import com.bosssoft.bes.basedata.center.dao.domain.TCombExamConfig;
import com.bosssoft.bes.basedata.center.dao.example.TCombExamConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCombExamConfigMapper {
    long countByExample(TCombExamConfigExample example);

    int deleteByExample(TCombExamConfigExample example);

    int deleteByPrimaryKey(Long combExamId);

    int insert(TCombExamConfig record);

    int insertSelective(TCombExamConfig record);

    List<TCombExamConfig> selectByExample(TCombExamConfigExample example);

    TCombExamConfig selectByPrimaryKey(Long combExamId);

    int updateByExampleSelective(@Param("record") TCombExamConfig record, @Param("example") TCombExamConfigExample example);

    int updateByExample(@Param("record") TCombExamConfig record, @Param("example") TCombExamConfigExample example);

    int updateByPrimaryKeySelective(TCombExamConfig record);

    int updateByPrimaryKey(TCombExamConfig record);
}