package com.springaop.demo.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class LoggingAspect {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Before("com.springaop.demo.aspects.CommonPointcutConfig.businessAndDataPackageConfig()") // WHEN -> Pointcut
    public void logMethodCallBefore(JoinPoint joinPoint) {
        logger.info("Before Aspect log method is called. - {}", joinPoint);  // WHAT -> Advice
    }

    @After("com.springaop.demo.aspects.CommonPointcutConfig.businessAndDataPackageConfig()")
    public void logMethodCallAfter(JoinPoint joinPoint) {
        logger.info("After Aspect log method is called. - {}", joinPoint);
    }

    @AfterThrowing(pointcut = "com.springaop.demo.aspects.CommonPointcutConfig.businessAndDataPackageConfig()", throwing = "exception")
    public void logMethodCallAfterThrowing(JoinPoint joinPoint, Exception exception) {
        logger.info("After Aspect log method is called. - {} and throwing -> {}", joinPoint, exception);
    }

    @AfterReturning(pointcut = "com.springaop.demo.aspects.CommonPointcutConfig.businessAndDataPackageConfig()", returning = "resultValue")
    public void logMethodCallAfterReturning(JoinPoint joinPoint, Object resultValue) {
        logger.info("After Aspect log method is called. - {} and returning -> {}", joinPoint, resultValue);
    }
}
