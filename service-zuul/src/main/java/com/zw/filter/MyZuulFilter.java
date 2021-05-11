package com.zw.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import com.zw.validator.ParameterValidator;
import com.zw.validator.TokenValidatorlmp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName springclound2021
 * @Descripation TODO
 * @Author zhangwei
 * @Date 2021-05-08 上午11:27
 * @Version 1.0
 */

@Component
public class MyZuulFilter extends ZuulFilter {

    @Autowired
    List<ParameterValidator> validators;
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        for(ParameterValidator validator:validators){
            if(validator instanceof TokenValidatorlmp){
                return validator.validator(ctx);
            }
        }
        return null;
    }
}
