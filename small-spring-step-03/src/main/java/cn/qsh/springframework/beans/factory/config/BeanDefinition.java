package cn.qsh.springframework.beans.factory.config;

/**
 * <p>
 *
 * @author: mini
 * @Date: 2022-06-16 15:24
 * @Description: 定义bean
 */

public class BeanDefinition {
    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }
}
