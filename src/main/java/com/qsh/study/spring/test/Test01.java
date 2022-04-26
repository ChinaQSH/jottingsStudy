package com.qsh.study.spring.test;

import com.qsh.study.spring.config.Myconfig01;
import com.qsh.study.spring.config.dto.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p>
 *
 * @author: mini
 * @Date: 2022-04-25 16:15
 * @Description:
 */

public class Test01 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Myconfig01.class);
        Person bean = annotationConfigApplicationContext.getBean(Person.class);
        System.out.println(bean);

        String[] beanNamesForType = annotationConfigApplicationContext.getBeanNamesForType(Person.class);
        for (String s : beanNamesForType) {
            System.out.println(s);
        }
    }
}
