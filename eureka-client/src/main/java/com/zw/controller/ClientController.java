package com.zw.controller;

import com.zw.model.GetConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName springclound2021
 * @Descripation TODO
 * @Author zhangwei
 * @Date 2021-05-07 上午11:11
 * @Version 1.0
 */
@RestController
@RefreshScope
public class ClientController {

    @Value("${server.port}")
    String port;

    @Autowired
    GetConfig config;

    @RequestMapping("/client")
    public String getClient(){
        return "this eureka client port is : "+ port;
    }

    @RequestMapping("/clientName")
    public String getClientName(@RequestParam String name){
        return "Hello "+ name +" ,this eureka client port is : "+ port;
    }

    @RequestMapping("/getConfig")
    public String getConfig(){
        return config.toString();
        //return null;
    }

}
