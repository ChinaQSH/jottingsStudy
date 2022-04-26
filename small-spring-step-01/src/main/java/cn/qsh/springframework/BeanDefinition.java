package cn.qsh.springframework;

/**
 * <p>
 *
 * @author: mini
 * @Date: 2022-04-26 15:55
 * @Description: Bean 的定义
 */

public class BeanDefinition {
    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
