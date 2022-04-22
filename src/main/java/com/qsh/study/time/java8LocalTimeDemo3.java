package com.qsh.study.time;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * <p>
 *
 * @author: mini
 * @Date: 2022-04-22 11:16
 * @Description:LocalData和LocalTime转换
 */

public class java8LocalTimeDemo3 {
    /**
     * 功能描述
     * <p>
     * <p>
     * toLocalDate()：将LocalDateTime转换为相应的LocalDate对象
     * toLocalTime()：将LocalDateTime转换为相应的LocalTime对象
     */
    @Test
    public void test() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        LocalDate localDate = now.toLocalDate();
        System.out.println(localDate);
        LocalTime localTime = now.toLocalTime();
        System.out.println(localTime);
    }
}
