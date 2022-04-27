package cn.qsh.springframework.beans.factory.support;

import cn.qsh.springframework.beans.factory.config.BeanDefinition;

/**
 * <p>
 *
 * @author: mini
 * @Date: 2022-04-27 10:06
 * @Description:
 */

public interface BeanDefinitionRegistry {
    /**
     * 向注册表中注册 BeanDefinition
     *
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
