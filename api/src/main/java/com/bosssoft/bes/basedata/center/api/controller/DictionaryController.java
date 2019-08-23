package com.bosssoft.bes.basedata.center.api.controller;

import com.alibaba.fastjson.JSON;
import com.bosssoft.bes.basedata.center.pojo.dto.DictionaryDTO;
import com.bosssoft.bes.basedata.center.pojo.vo.DictionaryVO;
import com.bosssoft.bes.basedata.center.service.DictionaryService;

import com.bosssoft.hr.train.bossbescommonlogging.annotation.Log;
import common.AbstractBaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import protocol.CommonRequest;
import protocol.CommonResponse;

import utils.Converter;
import utils.validator.ValidationResult;
import utils.validator.ValidatorImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * @author
 */
@CrossOrigin("*")
@RestController
@RequestMapping(value = "/boss/bes/basedata/dictionary")
public class DictionaryController extends AbstractBaseController {

    @Autowired
    private DictionaryService<DictionaryDTO, DictionaryDTO> dictionaryService;

    /**参数校验工具类*/
    @Autowired
    private ValidatorImpl validator;

    @Autowired
    Converter converter;

    /**返回给前端的消息*/
    private String message;

    DictionaryVO dictionaryVO = new DictionaryVO();

    DictionaryDTO dictionaryDTO = new DictionaryDTO();

    private String token = "eyJhbGciOiJIUzI1NiJ9.eyJjb21wYW55SWQiOiIxIiwicm9sZUlkIjoiMSIsImlzcyI6InN5c191c2VyIiwibmFtZSI6IuWViuWViiIsImlkIjoiMSIsImV4cCI6MTU3MTcyNTEyNSwiaWF0IjoxNTY2NTQxMTI1LCJvcmdJZCI6IjExMSJ9._XES7YiCU3ebulefJrDJAYVG3ZToH-a_OI0G_I9yHH8";

    /**
     * 数据字典添加
     *
     * @param commonRequest
     * @return: protocol.CommonResponse
     */
    @Log
    @Override
    @RequestMapping(value = "save",method = RequestMethod.POST)

    public CommonResponse save(@RequestBody  CommonRequest commonRequest) {

        dictionaryVO = (DictionaryVO) converter.getVoFromCommonRequest(commonRequest,dictionaryVO.getClass());
        converter.copyProperties(dictionaryVO,dictionaryDTO);
        dictionaryService.save(dictionaryDTO,token);
        return CommonResponse.create("1","0","3",false,"添加成功！");
    }

    /**
     * 数据字典删除
     *
     * @param commonRequest
     * @return: protocol.CommonResponse
     */
    @Log
    @Override
    @RequestMapping(value = "delete",method = RequestMethod.POST)
    public CommonResponse delete(@RequestBody CommonRequest commonRequest) {

        dictionaryVO = (DictionaryVO) converter.getVoFromCommonRequest(commonRequest,dictionaryVO.getClass());
        dictionaryService.deleteById(dictionaryVO.getId());
        return CommonResponse.create("1","0","1",false,"删除成功！");
    }

    /**
     * 数据字典更新
     *
     * @param commonRequest
     * @return: protocol.CommonResponse
     */
    @Log
    @Override
    @RequestMapping(value = "update",method = RequestMethod.POST)
    public CommonResponse update(@RequestBody CommonRequest commonRequest) {

        dictionaryVO = (DictionaryVO) converter.getVoFromCommonRequest(commonRequest,dictionaryVO.getClass());
        converter.copyProperties(dictionaryVO,dictionaryDTO);
        if(dictionaryService.update(dictionaryDTO, token)){
            message = "修改成功！";
            return CommonResponse.create("1","0","1",false,message);
        }else {
            message = "修改错误！";
            return CommonResponse.create("1","1","1",false,message);
        }
    }

    /**
     * 数据字典查找
     *
     * @param commonRequest
     * @return: protocol.CommonResponse
     */
    @Log
    @Override
    @RequestMapping(value = "query",method = RequestMethod.POST)
    public CommonResponse query(@RequestBody CommonRequest commonRequest) {
        System.out.println(commonRequest.toString());
        dictionaryVO = (DictionaryVO) converter.getVoFromCommonRequest(commonRequest,dictionaryVO.getClass());
        converter.copyProperties(dictionaryVO,dictionaryDTO);
        List<DictionaryVO> list = new ArrayList<>();
        converter.copyProperties(dictionaryService.query(dictionaryDTO),list);
        return CommonResponse.create("1","1","1",false,list);
    }

}
