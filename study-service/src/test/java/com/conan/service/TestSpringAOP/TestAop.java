package com.conan.service.TestSpringAOP;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {

    @Test
    public void testAop(){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext-AOP.xml");
        CommonService commonService = context.getBean("commonService", CommonService.class);
        commonService.insert();
    }

}
