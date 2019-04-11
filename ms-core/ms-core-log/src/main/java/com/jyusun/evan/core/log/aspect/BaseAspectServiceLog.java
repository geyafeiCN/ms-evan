package com.jyusun.evan.core.log.aspect;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.alibaba.fastjson.JSONObject;

import lombok.extern.slf4j.Slf4j;

/**
 * 作用描述：
 *  - 日志切面，扫描服务
 *  - 由于包路径不同导致启动类扫描不到，需要使用日志切面项目中新建空类继承此类且加上注解即可
 * @author jyusun at 2019/1/2 20:07
 * @version 1.0.0
 */
@Aspect
@Slf4j
public class BaseAspectServiceLog {

    /**
     * 描述：
     * - 申明一个切点,通过execution表达式进行切面
     *
     * @author jyusun at 2019/1/2 20:07
     */
    @Pointcut("execution(* com.jyusun.evan.*.service.*.*(..))")
    private void logPointCut() {
    }


    /**
     * 描述：
     * - 请求method前打印内容
     *
     * @param joinPoint 请求相关信息
     * @author jyusun at 2019/1/2 20:07
     */
    @Before(value = "logPointCut()")
    public void methodBefore(JoinPoint joinPoint) {
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder
                .getRequestAttributes();

        HttpServletRequest request = requestAttributes.getRequest();
        log.info("===============请求内容===============");
        try {
            /* 打印请求内容*/
            log.info("请求地址:" + request.getRequestURL().toString());
            log.info("请求方式:" + request.getMethod());
            log.info("请求类方法:" + joinPoint.getSignature());
            log.info("请求类方法参数:" + Arrays.toString(joinPoint.getArgs()));
        } catch (Exception e) {
            log.error("###LogAspectService.class methodBefore() ### ERROR:", e);
        }
    }

    /**
     * 描述：
     * - 在方法执行完结后打印响应内容
     *
     * @param o 响应信息
     * @author jyusun at 2019/1/2 20:07
     */
   @AfterReturning(returning = "o", pointcut = "logPointCut()")
    public void methodAfterReturing(Object o) {
       log.info("===============响应内容===============");
        try {
            log.info("Response内容:" + JSONObject.toJSONString(o));
        } catch (Exception e) {
            log.error("###LogAspectService.class methodAfterReturing() ### ERROR:", e);
        }
       log.info("======================================");
    }
}
