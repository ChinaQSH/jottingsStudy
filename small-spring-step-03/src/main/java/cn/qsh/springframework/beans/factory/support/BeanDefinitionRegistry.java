package cn.qsh.springframework.beans.factory.support;

import cn.qsh.springframework.beans.factory.config.BeanDefinition;

/**
 * <p>
 *
 * @author: mini
 * @Date: 2022-06-16 15:27
 * @Description:
 */

public interface BeanDefinitionRegistry {
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
