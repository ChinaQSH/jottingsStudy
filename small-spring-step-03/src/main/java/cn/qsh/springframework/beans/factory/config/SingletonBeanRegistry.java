package cn.qsh.springframework.beans.factory.config;

/**
 * <p>
 * 单例bean注册
 *
 * @author: mini
 * @Date: 2022-06-16 15:25
 * @Description: 单例bean注册
 */

public interface SingletonBeanRegistry {
    Object getSingletonBean(String name);
}
