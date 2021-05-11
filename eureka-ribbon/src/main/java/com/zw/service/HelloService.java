package com.zw.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName springclound2021
 * @Descripation TODO
 * @Author zhangwei
 * @Date 2021-05-07 下午2:52
 * @Version 1.0
 */

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "getError")
    public String getRibbonClientService(){
        return restTemplate.getForObject("http://CLOUD-EUREKA-CLIENT/client",String.class);
    }

    @HystrixCommand(fallbackMethod = "getError")
    public String getRibbonClientByNameService(String name){
        return restTemplate.getForObject("http://CLOUD-EUREKA-CLIENT/clientName?name="+name,String.class);
    }

    public String getError(){
        return "Sorry error!";
    }

    public String getError(String name){
        return "Sorry "+ name + " ,system error!";
    }
}
