package com.zw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName springclound2021
 * @Descripation TODO
 * @Author zhangwei
 * @Date 2021-05-12 下午2:41
 * @Version 1.0
 */
@RestController
public class ClientController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/clientInfo1")
    public String getClientInfo(){
      return "this is : "+ this.getClass().getName();
    }

    @GetMapping("/getAnother")
    public String getClient2(){
        return restTemplate.getForObject("http://localhost:8779/clientInfo2",String.class);
    }

}
