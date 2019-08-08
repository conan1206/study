package com.conan.service.TestSpringAOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AuthAspect {

    @Before(value = "@annotation(com.conan.service.TestSpringAOP.Auth))")
    public void before(JoinPoint joinPoint) {
        System.out.println("auth success");
    }

}
