package com.zw.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @ClassName springclound2021
 * @Descripation TODO
 * @Author zhangwei
 * @Date 2021-05-07 下午4:18
 * @Version 1.0
 */

@Component
public class FeignServiceImp implements FeignService{
    @Override
    public String getFeignClient() {
        return "sorry, error now !";
    }

    @Override
    public String getFeignClientByName(String name) {
        return "sorry "+name+" , system error now !";
    }

    @Override
    public String getClientConfig() {
        return "getConfig get Error " ;
    }

}
