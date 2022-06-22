package cn.qsh.springframework;

import cn.qsh.springframework.beans.factory.config.BeanDefinition;
import cn.qsh.springframework.beans.factory.support.DefaultListableBeanFactory;
import cn.qsh.springframework.test.UserService;
import cn.qsh.springframework.test.UserServiceTwo;
import org.junit.Test;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.NoOp;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

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

    @Test
    public void test_newInstance() throws IllegalAccessException, InstantiationException {
        UserServiceTwo userService = UserServiceTwo.class.newInstance();
        System.out.println(userService);
    }

    @Test
    public void test_parameterTypes() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<UserService> userServiceClass = UserService.class;
        Constructor<?>[] declaredConstructors = userServiceClass.getDeclaredConstructors();
        Constructor<?> constructor = declaredConstructors[0];
        Constructor<UserService> declaredConstructor = userServiceClass.getDeclaredConstructor(constructor.getParameterTypes());
        UserService qsh = declaredConstructor.newInstance("qsh");
        System.out.println(qsh);
    }


    @Test
    public void test_cglib(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserService.class);
        enhancer.setCallback(new NoOp() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        });
        Object obj = enhancer.create(new Class[]{String.class}, new Object[]{"qsh"});
        System.out.println(obj);
    }
}
