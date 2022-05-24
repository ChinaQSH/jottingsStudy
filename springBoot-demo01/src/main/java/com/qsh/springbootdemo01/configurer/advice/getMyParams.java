package com.qsh.springbootdemo01.configurer.advice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *
 * @author: mini
 * @Date: 2022-05-18 16:09
 * @Description:
 */
@ControllerAdvice
public class getMyParams {
    // @ModelAttribute(name="user")
    // public Map<String,Object> mydata() {
    //     HashMap<String, Object> map = new HashMap<>();
    //     map.put("age", 99);
    //     map.put("gender", "男");
    //     return map;
    // }

    @ExceptionHandler(Exception.class)
    public ModelAndView myException(Exception e){
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", e.getMessage());
        mv.setViewName("myerror");
        return mv;
    }

}
