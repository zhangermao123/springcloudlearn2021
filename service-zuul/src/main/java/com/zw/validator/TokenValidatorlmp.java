package com.zw.validator;

import com.netflix.ribbon.proxy.annotation.Http;
import com.netflix.zuul.context.RequestContext;
import com.zw.model.CommonError;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName springclound2021
 * @Descripation TODO
 * @Author zhangwei
 * @Date 2021-05-08 上午11:21
 * @Version 1.0
 */
@Component
public class TokenValidatorlmp implements ParameterValidator{
    private static Logger log = LoggerFactory.getLogger(TokenValidatorlmp.class);
    @Override
    public CommonError validator(RequestContext ctx) {
        HttpServletRequest request = ctx.getRequest();
        log.info(String.format("%s >>> %s", request.getMethod(), request.getRequestURL().toString()));
        Object accessToken = request.getParameter("token");
        if(accessToken == null) {
            log.warn("token is empty");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(HttpStatus.UNAUTHORIZED.value());
            try {
                ctx.getResponse().getWriter().write(CommonError.NERROR.message);
            }catch (Exception e){
                log.error("some error : "+ e.getMessage());
            }

            return null;
        }
        log.info("ok");
        return null;
    }
}
