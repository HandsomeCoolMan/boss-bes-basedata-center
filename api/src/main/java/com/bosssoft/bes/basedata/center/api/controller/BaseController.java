package com.bosssoft.bes.basedata.center.api.controller;

import protocol.CommonRequest;
import protocol.CommonResponse;

public abstract class BaseController {
    /**
     * 基础添加请求
     *
     * @param commonRequest
     * @return
     */
    public abstract CommonResponse save(CommonRequest commonRequest);

    /**
     * 基础删除请求
     *
     * @param commonRequest
     * @return
     */
    public abstract CommonResponse delete(CommonRequest commonRequest);

    /**
     * 基础更新请求
     *
     * @param commonRequest
     * @return
     */
    public abstract CommonResponse update(CommonRequest commonRequest);

    /**
     * 基础查找请求
     *
     * @param commonRequest
     * @return
     */
    public abstract CommonResponse query(CommonRequest commonRequest);
}
