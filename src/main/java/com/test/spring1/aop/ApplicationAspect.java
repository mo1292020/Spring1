package com.test.spring1.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ApplicationAspect {

    @Before(value = "execution(* com.test.spring1.service.SpringService.*(..))")
    public void beforeAdvice(JoinPoint joinPoint){
        System.out.println("Spring Service Before method: " + joinPoint.getSignature());
    }

}
