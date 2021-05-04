package com.company.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UserProxy {
    @Pointcut(value = "execution(* com.company.entity.User.getName(..))")
    public void getNamePointCut(){

    }
    @Before(value = "getNamePointCut()")
    public void before(){
        System.out.println("before");
    }
}
