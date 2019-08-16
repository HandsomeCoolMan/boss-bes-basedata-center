package com.bosssoft.bes.basedata.center.api.aop;


import com.alibaba.fastjson.JSON;
import com.bosssoft.bes.basedata.center.entity.Dictionary;
import com.bosssoft.bes.basedata.center.pojo.vo.DictionaryVO;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import protocol.CommonRequest;
import utils.Converter;

@Aspect
@Configuration
public class ParamCheck {
    private Logger logger = LoggerFactory.getLogger(ParamCheck.class);

    public ParamCheck() {
    }

    @Pointcut("@annotation(com.bosssoft.bes.basedata.center.api.aop.ValidCheck)")
    public void validCut() {
    }

    @Before("validCut()")
    public void volidRequest(JoinPoint joinPoint) {
        logger.info("记录开始------------------------------------------------------");
        for (Object arg:joinPoint.getArgs()) {
            logger.info("请求参数为:"+arg.toString());
            System.out.println("请求参数为："+arg.toString());
            CommonRequest commonRequest =(CommonRequest) Converter.getObjectFromJson(JSON.toJSONString(arg),CommonRequest.class);
            DictionaryVO dictionaryVO = (DictionaryVO) Converter.getObjectFromJson(JSON.toJSONString(commonRequest.getBody().getData()),DictionaryVO.class);

            //System.out.println("切面获得的数据  "+dictionaryVO);
            //joinPoint.proceed(DictionaryVO);

        }
        logger.info("请求的方法为："+joinPoint.getSignature().getName());
        logger.info("请求记录完成");
    }

    /*@AfterReturning(
        value = "validCut()",
        returning = "result"
    )
    public void logResponse(JoinPoint joinPoint, Object result) {
        this.logger.info(joinPoint.getSignature().getName() + " 执行完毕");
        this.logger.info("执行结果为：" + result);
    }

    @AfterThrowing(
        value = "validCut()",
        throwing = "e"
    )
    public void logException(JoinPoint joinPoint, Exception e) {
        this.logger.error(joinPoint.getSignature().getName() + " 方法执行异常");
        if (e instanceof BaseException) {
            BaseException exception = (BaseException)e;
            this.logger.error("异常为: " + e.getMessage() + " 异常码为：  " + ((BaseException)e).getErrorCode() + "  异常堆栈打印：" + e.fillInStackTrace());
        }

        this.logger.error("异常为: " + e.getMessage() + "    " + e.fillInStackTrace());
    }*/
}
