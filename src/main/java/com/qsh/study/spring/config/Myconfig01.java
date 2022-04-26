package com.qsh.study.spring.config;

import com.qsh.study.spring.config.dto.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * spring注解的配置项
 *
 * @author: mini
 * @Date: 2022-04-25 16:08
 * @Description: spring注解的配置项
 */
@Configuration   //注解spring配置类
public class Myconfig01 {

    @Bean
    @Transactional
    public Person person(){
        return new Person(1,"ls");
    }
}
