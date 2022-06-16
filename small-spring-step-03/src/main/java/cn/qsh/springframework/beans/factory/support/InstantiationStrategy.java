package cn.qsh.springframework.beans.factory.support;

import cn.qsh.springframework.beans.BeansException;
import cn.qsh.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * <p>
 *
 * @author: mini
 * @Date: 2022-06-16 15:30
 * @Description:
 */

public interface InstantiationStrategy {
    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;
}
