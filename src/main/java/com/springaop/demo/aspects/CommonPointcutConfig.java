package com.springaop.demo.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class CommonPointcutConfig {

    @Pointcut("execution(* com.springaop.demo.*.*.*(..))")
    public void businessAndDataPackageConfig() {}

    @Pointcut("execution(* com.springaop.demo.business.*.*(..))")
    public void businessPackageConfig() {}

    @Pointcut("execution(* com.springaop.demo.data.*.*(..))")
    public void dataPackageConfig() {}

    @Pointcut("@annotation(com.springaop.demo.annotations.TrackTime.java)")
    public void trackTimeAnnotation() {}
}
