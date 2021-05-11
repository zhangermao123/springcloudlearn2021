package com.zw.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName springclound2021
 * @Descripation TODO
 * @Author zhangwei
 * @Date 2021-05-07 下午3:59
 * @Version 1.0
 */
@FeignClient(value = "cloud-eureka-client",fallback = FeignServiceImp.class)
public interface FeignService {

    @RequestMapping(value = "/client",method = RequestMethod.GET)
    String getFeignClient();

    @RequestMapping(value = "/clientName",method = RequestMethod.GET)
    String getFeignClientByName(@RequestParam String name);

    @RequestMapping(value = "/getConfig",method = RequestMethod.GET)
    String getClientConfig();
}
