package com.bosssoft.bes.basedata.center.api.controller;

import org.springframework.web.bind.annotation.RestController;
import protocol.CommonRequest;
import protocol.CommonResponse;

import java.util.List;
@RestController
public abstract class BaseController {
    public abstract CommonResponse add(CommonRequest object);
    public abstract CommonResponse delete(CommonRequest object);
    public abstract CommonResponse update(CommonRequest object);
    public abstract CommonResponse findByCondition(CommonRequest object);
}
