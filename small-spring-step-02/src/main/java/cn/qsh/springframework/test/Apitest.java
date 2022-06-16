package cn.qsh.springframework.test;

import cn.qsh.springframework.beans.factory.config.BeanDefinition;
import cn.qsh.springframework.beans.factory.support.DefaultListableBeanFactory;
import cn.qsh.springframework.test.bean.UserService;
import cn.qsh.springframework.test.bean.UserServiceTwo;
import org.junit.Test;

/**
 * <p>
 *
 * @author: mini
 * @Date: 2022-04-27 14:20
 * @Description:
 */

public class Apitest {
    @Test
    public void test() {

        //    初始化beanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        //    注册bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);

        beanFactory.registerBeanDefinition("user", beanDefinition);

        UserService user = (UserService) beanFactory.getBean("user");

        System.out.println(user);

        UserService user01 = (UserService) beanFactory.getBean("user");

        System.out.println(user01);

    }

    @Test
    public void testAllConstructors(){
        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
        BeanDefinition beanDefinition = new BeanDefinition(UserServiceTwo.class);
        defaultListableBeanFactory.registerBeanDefinition("user",beanDefinition);
        //会报错，因为是有参构造函数   at java.lang.Class.newInstance(Class.java:427)
        UserServiceTwo user = (UserServiceTwo) defaultListableBeanFactory.getBean("user");

        System.out.println(user);
    }
}
