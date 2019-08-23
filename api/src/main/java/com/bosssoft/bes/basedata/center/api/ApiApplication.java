package com.bosssoft.bes.basedata.center.api;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import tk.mybatis.spring.annotation.MapperScan;

@EnableAspectJAutoProxy
@SpringBootApplication(scanBasePackages ={
        "com.bosssoft.bes.basedata.center.service",
        "com.bosssoft.bes.basedata.**.controller",
        "com.bosssoft.hr.train.bossbescommonlogging.annotation",
        "utils",
        "annotations"
})
@MapperScan(basePackages ="com.bosssoft.bes.basedata.center.dao")
@EnableEurekaClient
public class ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }

    @Value("${server.port}")
    String port;
    @RequestMapping("/hi")
    public String home(@RequestParam String name) {
        return "hi "+name+",i am from port:" +port;
    }
}
