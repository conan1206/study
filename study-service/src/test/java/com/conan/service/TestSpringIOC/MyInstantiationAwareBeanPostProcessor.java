package com.conan.service.TestSpringIOC;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;

import java.beans.PropertyDescriptor;

/**
 * 一般情况下，当我们需要实现InstantiationAwareBeanPostProcessor接口时，是通过继承Spring框架中InstantiationAwareBeanPostProcessor接口实现类
 * InstantiationAwareBeanPostProcessorAdapter这个适配器类来简化我们实现接口的工作
 * Created by yanxiao on 2016/8/1.
 */
public class MyInstantiationAwareBeanPostProcessor extends InstantiationAwareBeanPostProcessorAdapter {

    public MyInstantiationAwareBeanPostProcessor() {
        System.out.println("【InstantiationAwareBeanPostProcessor接口】构造方法");
    }

    /**
     * 实例化Bean之前调用
     */
    @Override
    public Object postProcessBeforeInstantiation(Class beanClass, String beanName) throws BeansException {
        System.out.println("【InstantiationAwareBeanPostProcessor接口】postProcessBeforeInstantiation方法");
        return null;
    }

    /**
     * 实例化Bean之后调用
     */
    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        System.out.println("【InstantiationAwareBeanPostProcessor接口】postProcessAfterInstantiation");
        return true;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("【InstantiationAwareBeanPostProcessor接口】调用postProcessBeforeInitialization方法，这里可对"+beanName+"的属性进行更改。");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("【InstantiationAwareBeanPostProcessor接口】调用postProcessAfterInitialization方法，这里可对"+beanName+"的属性进行更改。");
        return bean;
    }

    /**
     * 设置某个属性时调用
     */
    @Override
    public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName)
            throws BeansException {
        System.out.println("【InstantiationAwareBeanPostProcessor接口】postProcessPropertyValues方法");
        return pvs;
    }
}
