package cn.qsh.springframework.beans.factory.config;

/**
 * <p>
 *
 * @author: mini
 * @Date: 2022-04-26 17:24
 * @Description: 单例注册接口定义
 */
public interface SingletonBeanRegistry {
    Object getSingleton(String name);
}
