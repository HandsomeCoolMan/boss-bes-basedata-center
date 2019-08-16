package com.bosssoft.bes.basedata.center.dao;

import com.bosssoft.bes.basedata.center.entity.Dictionary;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;


import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface DictionaryMapper extends Mapper<Dictionary>{


}
