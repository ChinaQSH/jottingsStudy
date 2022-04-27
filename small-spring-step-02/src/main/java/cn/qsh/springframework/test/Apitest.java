package cn.qsh.springframework.test;

import cn.qsh.springframework.beans.factory.config.BeanDefinition;
import cn.qsh.springframework.beans.factory.support.DefaultListableBeanFactory;
import cn.qsh.springframework.test.bean.UserService;
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
}
