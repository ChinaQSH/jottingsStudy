package cn.qsh.springframework.beans.factory.support;

import cn.qsh.springframework.beans.factory.BeanFactory;
import cn.qsh.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.BeansException;

/**
 * <p>
 *
 * @author: mini
 * @Date: 2022-06-16 15:26
 * @Description:
 */

public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory{
    @Override
    public Object getBean(String name) throws BeansException {
        return doGetBean(name, null);
    }

    @Override
    public Object getBean(String name, Object... args) throws BeansException {
        return doGetBean(name, args);
    }


    protected <T> T doGetBean(final String name, final Object[] args) {
        Object bean = getSingletonBean(name);
        if (bean != null) {
            return (T) bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);
        return (T) createBean(name, beanDefinition, args);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args) throws BeansException;

}
