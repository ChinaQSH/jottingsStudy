package cn.qsh.springframework.beans.factory.support;

import cn.qsh.springframework.beans.factory.BeanFactory;
import cn.qsh.springframework.beans.factory.BeansException;
import cn.qsh.springframework.beans.factory.config.BeanDefinition;
import cn.qsh.springframework.beans.factory.config.DefaultSingletonBeanRegistry;

/**
 * <p>
 *
 * @author: mini
 * @Date: 2022-04-26 17:42
 * @Description: 获取bean实例（将DefaultSingletonBeanRegistry获取bean的1方法覆盖）
 */

public  abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {
    @Override
    public Object getBean(String name) throws BeansException {
        Object bean = getSingleton(name);
        if (bean != null) {
            return bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name, beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;
}
