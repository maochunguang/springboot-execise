package com.mcg.exercise.extension;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author mao
 * Date：2020/12/27
 * Description：
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("--------------MyBeanPostProcessor postProcessBeforeInitialization beanName:" + beanName + " --------");

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("--------------MyBeanPostProcessor postProcessAfterInitialization beanName:" + beanName + " --------");

        return bean;
    }
}
