package cn.qsh.springframework;

import cn.qsh.springframework.beans.factory.config.BeanDefinition;
import cn.qsh.springframework.beans.factory.support.DefaultListableBeanFactory;
import cn.qsh.springframework.test.UserService;
import org.junit.Test;

/**
 * <p>
 *
 * @author: mini
 * @Date: 2022-06-16 15:33
 * @Description:
 */

public class ApiTest {

    @Test
    public void testApi() {
        //初始化bean
        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
        //    注入bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);

        defaultListableBeanFactory.registerBeanDefinition("userService",beanDefinition);

        UserService bean = (UserService) defaultListableBeanFactory.getBean("userService", "qsh");
        UserService bean1 = (UserService) defaultListableBeanFactory.getBean("userService");



        System.out.println(bean);

        System.out.println(bean1);

    }
}
