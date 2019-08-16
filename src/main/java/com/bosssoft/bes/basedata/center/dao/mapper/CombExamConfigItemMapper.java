package com.bosssoft.bes.basedata.center.dao.mapper;

import com.bosssoft.bes.basedata.center.dao.domain.CombExamConfigItem;
import com.bosssoft.bes.basedata.center.dao.example.CombExamConfigItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CombExamConfigItemMapper {
    long countByExample(CombExamConfigItemExample example);

    int deleteByExample(CombExamConfigItemExample example);

    int deleteByPrimaryKey(Long combExamConfigItemId);

    int insert(CombExamConfigItem record);

    int insertSelective(CombExamConfigItem record);

    List<CombExamConfigItem> selectByExample(CombExamConfigItemExample example);

    CombExamConfigItem selectByPrimaryKey(Long combExamConfigItemId);

    int updateByExampleSelective(@Param("record") CombExamConfigItem record, @Param("example") CombExamConfigItemExample example);

    int updateByExample(@Param("record") CombExamConfigItem record, @Param("example") CombExamConfigItemExample example);

    int updateByPrimaryKeySelective(CombExamConfigItem record);

    int updateByPrimaryKey(CombExamConfigItem record);
}