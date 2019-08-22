package com.bosssoft.bes.basedata.center.api.controller;

import com.alibaba.fastjson.JSON;
import com.bosssoft.bes.basedata.center.entity.Dictionary;
import com.bosssoft.bes.basedata.center.pojo.vo.DictionaryVO;
import com.bosssoft.bes.basedata.center.service.DictionaryService;
import com.bosssoft.hr.train.bossbescommonlogging.annotation.Log;

import exception.BusinessException;
import exception.EnumException;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import protocol.CommonRequest;
import protocol.CommonResponse;

import utils.Converter;
import utils.SnowFlake;
import utils.validator.ValidationResult;
import utils.validator.ValidatorImpl;


import java.util.List;


/**
 * @author
 */
@CrossOrigin("*")
@RestController
@RequestMapping(value = "/boss/bes/basedata/dictionary")
public class DictionaryController extends BaseController {

    @Autowired
    private DictionaryService<Dictionary> dictionaryService;

    /**参数校验工具类*/
    @Autowired
    private ValidatorImpl validator;

    /**返回给前端的消息*/
    private String message;

    /**雪花算法生成工具类*/
    private SnowFlake snowFlake = new SnowFlake(2,3);

    /**
     * 数据字典添加
     *
     * @param commonRequest
     * @return: protocol.CommonResponse
     */
    @Log
    @RequestMapping(value = "add",method = RequestMethod.POST)
    public CommonResponse add(@RequestBody  CommonRequest commonRequest) {
        
        DictionaryVO dictionaryVO = (DictionaryVO) Converter.getObjectFromJson(JSON.toJSONString(commonRequest.getBody().getData()),DictionaryVO.class);

        System.out.println("controller获得的参数："+dictionaryVO.toString());

        Dictionary dictionary = new Dictionary();
        Converter.copyProperties(dictionaryVO,dictionary);

        //采用validator验证
        ValidationResult result = validator.validate(dictionaryVO);
        if(result.isHasErrors()){
            //这里面存的就是错误信息
            result.getErrMsg();

            throw new BusinessException(EnumException.SYSTEM_PARAMETER_VALUE_INVALIDE);
        }
        dictionaryService.save(dictionary);
        return CommonResponse.create("1","2","3",false,"添加成功！");
    }


    @Log
    @RequestMapping(value = "hello",method = RequestMethod.GET)
    public String say(){
        return "hello";
    }


    @Override
    public CommonResponse save(CommonRequest commonRequest) {
        return null;
    }

    /**
     * 数据字典删除
     *
     * @param commonRequest
     * @return: protocol.CommonResponse
     */
    @Override
    @RequestMapping(value = "delete",method = RequestMethod.POST)
    public CommonResponse delete(@RequestBody CommonRequest commonRequest) {

        Dictionary dictionary = JSON.parseObject( JSON.toJSONString(commonRequest.getBody().getData()) , Dictionary.class);
        dictionaryService.delete(dictionary);
        return CommonResponse.create("1","1","1",false,"删除成功！");
    }

    /**
     * 数据字典更新
     *
     * @param commonRequest
     * @return: protocol.CommonResponse
     */
    @Override
    @RequestMapping(value = "update",method = RequestMethod.POST)
    public CommonResponse update(@RequestBody CommonRequest commonRequest) {

        Dictionary dictionary = JSON.parseObject( JSON.toJSONString(commonRequest.getBody().getData()) , Dictionary.class);
        if(dictionaryService.update(dictionary) <= 0 ){
            message = "修改错误！";
            return CommonResponse.create("1","1","1",false,message);
        }
        message = "修改成功！";
        return CommonResponse.create("1","1","1",false,message);
    }

    @Override
    public CommonResponse query(CommonRequest object) {
        return null;
    }

    /**
     * 数据字典查找
     *
     * @param commonRequest
     * @return: protocol.CommonResponse
     */
    @RequestMapping(value = "getDictionaryInfo",method = RequestMethod.POST)
    public CommonResponse findByCondition(@RequestBody CommonRequest commonRequest) {
        Dictionary dictionary = JSON.parseObject( JSON.toJSONString(commonRequest.getBody().getData()) , Dictionary.class);
        List<Dictionary> dictionaryList = dictionaryService.query(dictionary);
        System.out.println(dictionaryList);
        System.out.println("数据源自handsome！");
        return CommonResponse.create("1","200","1",false,dictionaryList);
    }

}
