package com.qsh.springbootdemo01.controller;

import com.qsh.springbootdemo01.vo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotBlank;
import java.util.Map;

/**
 * <p>
 *
 * @author: mini
 * @Date: 2022-05-18 16:15
 * @Description:
 */
@RestController
@Validated
public class ControllerAdviceTestConteroller {
    private final Logger logger = LoggerFactory.getLogger(ControllerAdviceTestConteroller.class);

    @Autowired
    private User user;

    @Value("${com.qsh.name}")
    private String name;

    @PostMapping("/test")
    public String hello(Model model) {
        Map<String, Object> map = model.asMap();
        String user1 = map.get("user").toString();
        logger.info(String.format("ControllerAdvice全局数据绑定：user=====  %s", map.get("user").toString()));
        logger.info(String.format("ControllerAdvice全局数据绑定：user=====  %s", user1));
        System.out.println(map);
        return "hello controller advice";
    }


    @PostMapping("/test1")
    public String test1(){
        logger.info(String.format("ControllerAdvice全局异常处理"));
        int c = 1 / 0;
        System.out.println(c);
        return "hello controller advice";
    }


    @PostMapping("/test2")
    public String test2(){
        System.out.println("qqqqqqqqqqqqqqqqqqqqqqqqqqqqqq");
        System.out.println(name);
        return "name="+user.getName()+"; age="+user.getAge();
    }


    @PostMapping("/test3")
    public String test3(@NotBlank(message = "{required}") String username){
        System.out.println("qqqqqqqqqqqqqqqqqqqqqqqqqqqqqq");
        System.out.println(name);
        return "name="+user.getName()+"; age="+user.getAge();
    }
}
