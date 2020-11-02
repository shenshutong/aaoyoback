package com.bgs.aoyoback.intercepter;

import com.bgs.aoyoback.response.BaseResponse;
import com.bgs.aoyoback.response.StatusCode;
import com.bgs.aoyoback.service.CommonService;
import com.bgs.aoyoback.service.TokenService;
import org.apache.commons.lang.StringUtils;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Objects;

@Component
public class TokenIntercepter implements HandlerInterceptor {

    private static final Logger log = LoggerFactory.getLogger(TokenIntercepter.class);

    @Autowired
    private CommonService commonService;

    @Autowired
    private TokenService tokenService;

    //获取前端塞在请求头header里面的accessToken字段的值，然后进行验证与解析
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        if(handler instanceof HandlerMethod){//判断类型

            //在请求头中取出accessToken
            String accessToken = request.getHeader("accessToken");

            if(StringUtils.isBlank(accessToken)){

                log.error("====================用户身份验证失败======================");

                BaseResponse baseResponse = new BaseResponse(StatusCode.Fail,
                        "用户身份验证失败，请重新登录后再试。");

                //相应信息
                commonService.print(response,baseResponse);
            }else {

                log.error("====================用户身份验证开始======================");
                BaseResponse result = tokenService.validateToken(accessToken);

                if(Objects.equals(result.getCode(),StatusCode.Success.getCode())){

                    return true;
                }else{

                    commonService.print(response,result);
                    return false;
                }

            }

        }

        return false;
    }

    @Override
    public void postHandle
            (HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
        if (response.getStatus()==500){
            modelAndView.setViewName("/error/500");
        }else if (response.getStatus()==404){
            modelAndView.setViewName("/error/404");
        }
    }

    /**
     * 该方法也是需要当前对应的Interceptor的preHandle方法的返回值为true时才会执行。该方法将在整个请求完成之后，也就是DispatcherServlet渲染了视图执行，
     * 这个方法的主要作用是用于清理资源的，当然这个方法也只能在当前这个Interceptor的preHandle方法的返回值为true时才会执行。
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
