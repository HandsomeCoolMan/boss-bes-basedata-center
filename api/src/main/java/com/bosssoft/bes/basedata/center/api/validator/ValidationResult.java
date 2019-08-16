package com.bosssoft.bes.basedata.center.api.validator;

import org.apache.tomcat.util.buf.StringUtils;

import java.util.HashMap;
import java.util.Map;

public class ValidationResult {
    private boolean hasErrors;
    private Map<String,String> errorMsgMap = new HashMap<>();

    public boolean isHasErrors() {
        return hasErrors;
    }

    public void setHasErrors(boolean hasErrors) {
        this.hasErrors = hasErrors;
    }

    public Map<String, String> getErrorMsgMap() {
        return errorMsgMap;
    }

    public void setErrorMsgMap(Map<String, String> errorMsgMap) {
        this.errorMsgMap = errorMsgMap;
    }

    //通过字符串信息获取错误结果的msg方法
    public String getErrMsg(){
        return errorMsgMap.toString();
    }

}
