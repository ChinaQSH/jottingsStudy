package cn.qsh.springframework.beans.factory.config;

import lombok.Data;

/**
 * <p>
 *
 * @author: mini
 * @Date: 2022-04-26 17:15
 * @Description: 创建bean
 */
@Data
public class BeanDefinition {

    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }
}
