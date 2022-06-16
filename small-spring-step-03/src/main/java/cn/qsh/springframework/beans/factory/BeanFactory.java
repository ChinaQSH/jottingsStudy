package cn.qsh.springframework.beans.factory;

import org.springframework.beans.BeansException;

/**
 * <p>
 *
 * @author: mini
 * @Date: 2022-06-16 15:31
 * @Description: 重载了一个含有入参信息 args 的 getBean 方法，这样就可以方便的传递入参给构造函数实例化了
 */

public interface BeanFactory {

    Object getBean(String name) throws BeansException;

    Object getBean(String name, Object... args) throws BeansException;

}
