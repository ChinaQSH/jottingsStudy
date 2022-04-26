package cn.qsh.springframework.test.testApi;

import cn.qsh.springframework.BeanDefinition;
import cn.qsh.springframework.BeanFactory;
import cn.qsh.springframework.test.bean.UserService;
import org.junit.Test;

/**
 * <p>
 *
 * @author: mini
 * @Date: 2022-04-26 16:18
 * @Description:
 */

public class test_BeanFactory {
    @Test
    public void test() {
    //初始化 BeanFactory
        BeanFactory beanFactory = new BeanFactory();
    //    注册bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService",beanDefinition);


    // 获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.getUserInfo();
    }

}
