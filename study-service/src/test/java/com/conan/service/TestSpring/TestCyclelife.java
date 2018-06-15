package com.conan.service.TestSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yanxiao on 2016/8/1.
 */
public class TestCyclelife {

    public static void main(String[] args){
        System.out.println("--------------【初始化容器】---------------");

        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        System.out.println("-------------------【容器初始化成功】------------------");
        //得到studentBean，并显示其信息
        StudentBean studentBean = context.getBean("studentBean", StudentBean.class);
        System.out.println(studentBean);
        //得到teacherBean，并显示其信息
        TeacherBean teacherBean = context.getBean("teacherBean", TeacherBean.class);
        System.out.println(teacherBean);

        System.out.println("--------------------【销毁容器】----------------------");
        ((ClassPathXmlApplicationContext)context).registerShutdownHook();
    }
}
