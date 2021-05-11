package com.zw.controller;

import com.zw.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName springclound2021
 * @Descripation TODO
 * @Author zhangwei
 * @Date 2021-05-07 下午3:56
 * @Version 1.0
 */

@RestController
public class FeignController {

    @Autowired
    FeignService service;

    @GetMapping("/client")
    public String getFeignClient(){
        return service.getFeignClient();
    }

    @GetMapping("/clientName")
    public String getFeignClientByName(@RequestParam String name){
        return service.getFeignClientByName(name);
    }

    @GetMapping("/getClientConfig")
    public String getConfig(){
       return service.getClientConfig();
    }
}
