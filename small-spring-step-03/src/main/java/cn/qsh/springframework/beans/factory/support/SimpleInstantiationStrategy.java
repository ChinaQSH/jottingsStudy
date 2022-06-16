package cn.qsh.springframework.beans.factory.support;

import cn.qsh.springframework.beans.BeansException;
import cn.qsh.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * <p>
 *
 * @author: mini
 * @Date: 2022-06-16 15:31
 * @Description:  jdk实例化
 */

public class SimpleInstantiationStrategy implements InstantiationStrategy{
    //通过反射进行参数数据封装

    @Override
    public Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException {
        Class clazz = beanDefinition.getBeanClass();
        try {
            if (null != ctor) {
                return clazz.getDeclaredConstructor(ctor.getParameterTypes()).newInstance(args);
            } else {
                return clazz.getDeclaredConstructor().newInstance();
            }
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new BeansException("Failed to instantiate [" + clazz.getName() + "]", e);
        }
    }
}
