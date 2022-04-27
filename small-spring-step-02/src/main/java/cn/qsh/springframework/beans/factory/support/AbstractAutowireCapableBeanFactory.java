package cn.qsh.springframework.beans.factory.support;

import cn.qsh.springframework.beans.factory.BeansException;
import cn.qsh.springframework.beans.factory.config.BeanDefinition;

/**
 * <p>
 *
 * @author: mini
 * @Date: 2022-04-26 18:00
 * @Description:
 */

public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean = null;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new BeansException("Instantiation of bean failed", e);
        }

        addSingleton(beanName, bean);
        return bean;
    }

}

