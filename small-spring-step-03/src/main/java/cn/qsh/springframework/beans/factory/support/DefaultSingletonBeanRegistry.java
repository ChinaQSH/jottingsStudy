package cn.qsh.springframework.beans.factory.support;

import cn.qsh.springframework.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *
 * @author: mini
 * @Date: 2022-06-16 15:29
 * @Description:
 */

public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {
    private Map beanMap=new HashMap<String, Object>();
    @Override
    public Object getSingletonBean(String name) {
        return beanMap.get(name);
    }

    protected void addSingleton(String name,Object singletonObject){
        beanMap.put(name,singletonObject);
    }

}
