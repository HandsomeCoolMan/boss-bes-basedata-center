package com.bosssoft.bes.basedata.center.api.controller;

import org.springframework.web.bind.annotation.RestController;
import protocol.CommonRequest;
import protocol.CommonResponse;

/**
 * @author
 */
@RestController
public abstract class BaseController {
    /**
     * @param object
     * @return
     */
    public abstract CommonResponse add(CommonRequest object);

    /**
     * @param object
     * @return
     */
    public abstract CommonResponse delete(CommonRequest object);

    /**
     * @param object
     * @return
     */
    public abstract CommonResponse update(CommonRequest object);

    /**
     * @param object
     * @return
     */
    public abstract CommonResponse findByCondition(CommonRequest object);
}
