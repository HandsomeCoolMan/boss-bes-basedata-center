package com.bosssoft.bes.basedata.center.api;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import tk.mybatis.spring.annotation.MapperScan;

@EnableAspectJAutoProxy
/*@SpringBootApplication(scanBasePackages ={"com.bosssoft.bes.basedata.center.service","com.bosssoft.bes.basedata.**.controller",
        "com.bosssoft.hr.train.bossbescommonlogging.annotation","com.bosssoft.bes.basedata.center.api.aop",
        "com.bosssoft.bes.basedata.center.api.validator"
})*/
@SpringBootApplication
@ComponentScan({"com.bosssoft.bes.basedata.center.service","com.bosssoft.bes.basedata.**.controller",
        "com.bosssoft.hr.train.bossbescommonlogging.annotation","com.bosssoft.bes.basedata.center.api.aop",
        "com.bosssoft.bes.basedata.center.api.validator"
})
@MapperScan(basePackages ="com.bosssoft.bes.basedata.center.dao")
public class ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }

}
