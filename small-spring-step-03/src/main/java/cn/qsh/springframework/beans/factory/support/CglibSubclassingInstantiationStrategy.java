package cn.qsh.springframework.beans.factory.support;

import cn.qsh.springframework.beans.BeansException;
import cn.qsh.springframework.beans.factory.config.BeanDefinition;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.NoOp;

import java.lang.reflect.Constructor;

/**
 * <p>
 *
 * @author: mini
 * @Date: 2022-06-16 15:28
 * @Description: cglib 实例化
 */

public class CglibSubclassingInstantiationStrategy implements InstantiationStrategy {
    //通过hash值
    @Override
    public Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(beanDefinition.getBeanClass());
        enhancer.setCallback(new NoOp() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        });
        if (null == ctor) return enhancer.create();
        return enhancer.create(ctor.getParameterTypes(), args);
    }
}
