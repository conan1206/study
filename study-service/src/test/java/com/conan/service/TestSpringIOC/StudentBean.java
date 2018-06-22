package com.conan.service.TestSpringIOC;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

public class StudentBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware {
    private String name;
    private int age;

    private String beanName;//实现了BeanNameAware接口，Spring可以将BeanName注入该属性中
    private BeanFactory beanFactory;//实现了BeanFactory接口，Spring可将BeanFactory注入该属性中


    public StudentBean(){
        System.out.println("【StudentBean构造方法】无参构造方法");
    }

    @Override
    public String toString() {
        return "StudentBean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", beanName='" + beanName + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("【StudentBean-set注入】注入学生的name属性");
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("【StudentBean-set注入】注入学生的age属性");
        this.age = age;
    }

    /**
     * 自己编写的初始化方法
     */
    public void myInit(){
        System.out.println("【init-method】初始化方法");
    }

    /**
     * 自己编写的销毁方法
     */
    public void myDestroy(){
        System.out.println("【destroy-method】销毁方法");
    }

    /**
     * BeanFactoryAware接口的方法
     * @param beanFactory
     * @throws BeansException
     */
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
        System.out.println("【BeanFactoryAware接口】setBeanFactory方法得到beanFactory引用");
    }

    /**
     * BeanNameAware接口的方法
     * @param name
     */
    @Override
    public void setBeanName(String name) {
        this.beanName = name;
        System.out.println("【BeanNameAware接口】setBeanName方法得到Bean的名称");
    }

    /**
     * InitializingBean接口的方法
     * @throws Exception
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("【InitializingBean接口】afterPropertiesSet方法");
    }

    /**
     * DisposableBean接口的方法
     * @throws Exception
     */
    @Override
    public void destroy() throws Exception {
        System.out.println("【DisposableBean接口】destroy方法");
    }
}
