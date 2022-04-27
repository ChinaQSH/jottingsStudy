package cn.qsh.springframework.beans.factory.config;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 单例注册接口的实现
 *
 * @author: mini
 * @Date: 2022-04-26 17:27
 * @Description: 单例注册接口的实现
 */

public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {
    private Map<String, Object> beanDefinitionMap = new HashMap<>();

    @Override
    public Object getSingleton(String name) {
        return beanDefinitionMap.get(name);
    }

    protected void addSingleton(String name, Object singletonObject) {
        beanDefinitionMap.put(name, singletonObject);
    }
}
