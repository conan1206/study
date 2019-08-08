package com.conan.service.TestSpringAOP;

import org.springframework.stereotype.Service;

@Service("test")
public class TestBean implements TestBeanInf {

    private String testStr = "testStr";

    public String getTestStr(){
        return testStr;
    }

    public void setTestStr(String testStr){
        this.testStr = testStr;
    }

    @Auth
    public void test(){
        System.out.println("test");
    }

}
