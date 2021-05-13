package com.zw.validator;

import com.netflix.zuul.context.RequestContext;
import com.zw.model.CommonError;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName springclound2021
 * @Descripation TODO
 * @Author zhangwei
 * @Date 2021-05-08 上午11:11
 * @Version 1.0
 */
public interface ParameterValidator {

    CommonError validator(RequestContext context);

    default int priory(){
        return 0;
    }
}
