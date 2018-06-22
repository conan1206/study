package com.conan.service.TestSpringAOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class AspectJTest {

    @Pointcut("execution(* *.test(..))")
    public void test1(){
        System.out.println("test1");
    }

    @Before("test1()")
    public void beforeTest(){
        System.out.println("beforeTest");
    }

    @After("test1()")
    public void afterTest(){
        System.out.println("afterTest");
    }

    @Around("test1()")
    public Object aroundTest(ProceedingJoinPoint p){
        System.out.println("before1");
        Object o = null;
        try {
            o = p.proceed();
        }catch (Throwable e){
            e.printStackTrace();
        }

        System.out.println("after1");
        return o;
    }

}
