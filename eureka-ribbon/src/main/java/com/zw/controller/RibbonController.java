package com.zw.controller;

import com.zw.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName springclound2021
 * @Descripation 仪表盘地址http://localhost:8764/hystrix srpingboot2.0 需要添加 EnableCircuitBreaker 对应Hystrix
 * @Author zhangwei
 * @Date 2021-05-07 下午2:53
 * @Version 1.0
 */
@RestController
public class RibbonController {
    @Autowired
    HelloService helloService;

    @RequestMapping("/client")
    public String getRibbonClient(){
        return helloService.getRibbonClientService();
    }

    @RequestMapping("/clientName")
    public String getRibbonClientByName(@RequestParam String name){
        return helloService.getRibbonClientByNameService(name);
    }
}
