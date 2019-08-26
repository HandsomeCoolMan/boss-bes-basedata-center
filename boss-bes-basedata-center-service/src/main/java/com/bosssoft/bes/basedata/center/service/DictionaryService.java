package com.bosssoft.bes.basedata.center.service;

import com.bosssoft.bes.basedata.center.entity.Dictionary;
import com.bosssoft.bes.basedata.center.pojo.dto.DictionaryDTO;
import common.CommonService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface DictionaryService<T> extends CommonService<T> {

    List<Dictionary> queryAll(DictionaryDTO dictionaryDTO);
}
