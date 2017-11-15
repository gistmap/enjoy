package com.gistmap.config;

import com.gistmap.annotation.LoggerManage;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.aspectj.lang.annotation.Aspect;

/**
 * @desc : 日志管理
 * @author : gistmap
 * @date : 2017/9/13  22:16
 */
@Aspect
@Service
public class LoggerAdvice {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @org.aspectj.lang.annotation.Before("within(com.gistmap..*) && @annotation(loggerManage)")
    public void addBeforeLogger(JoinPoint joinPoint, LoggerManage loggerManage) {
        logger.info("执行 " + loggerManage.description() + " 开始");
        logger.info(joinPoint.getSignature().toString());
        logger.info(parseParames(joinPoint.getArgs()));
    }

    @AfterReturning("within(com.gistmap..*) && @annotation(loggerManage)")
    public void addAfterReturningLogger(JoinPoint joinPoint, LoggerManage loggerManage) {
        logger.info("执行 " + loggerManage.description() + " 结束");
    }

    @AfterThrowing(pointcut = "within(com.gistmap..*) && @annotation(loggerManage)", throwing = "ex")
    public void addAfterThrowingLogger(JoinPoint joinPoint, LoggerManage loggerManage, Exception ex) {
        logger.error("执行 " + loggerManage.description() + " 异常", ex);
    }

    private String parseParames(Object[] parames) {
        if (null == parames || parames.length <= 0) {
            return "";
        }
        StringBuffer param = new StringBuffer("传入参数[{}] ");
        for (Object obj : parames) {
            param.append(ToStringBuilder.reflectionToString(obj)).append("  ");
        }
        return param.toString();
    }
}
