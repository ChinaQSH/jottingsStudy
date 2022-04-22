package com.qsh.study.time;

import org.junit.Test;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;

/**
 * <p>
 *
 * @author: mini
 * @Date: 2022-04-22 10:49
 * @Description:
 */

public class java8LocalTimeDemo2 {
    /**
     * 功能描述
     * 与获取相关的方法(get系类的方法)
     * getYear()：获取年
     * getHour()：获取小时
     * getMinute()：获取分钟
     * getSecond()：获取秒值
     * getDayOfMonth()：获得月份天数(1-31)
     * getDayOfYear()：获得年份天数(1-366)
     * getDayOfWeek()：获得星期几(返回一个 DayOfWeek枚举值)
     * getMonth()：获得月份(返回一个 Month 枚举值)
     * getMonthValue()：获得月份(1-12)
     * getYear()：获得年份
     */
    @Test
    public void test() {
        //获取日期时分秒
        LocalDateTime now = LocalDateTime.now();

        //    获取年
        int year = now.getYear();
        System.out.println(year);

        //    获取月
        //    定义了枚举类，十二个月
        Month month = now.getMonth();
        int value = month.getValue();
        int monthValue = now.getMonthValue();
        System.out.println(month + "====" + value + "=====" + monthValue);


        //    获取当天是本月的第几天
        int dayOfMonth = now.getDayOfMonth();
        System.out.println(dayOfMonth);

        //    获取小时
        int hour = now.getHour();
        System.out.println(hour);
        //    获取分钟
        int minute = now.getMinute();
        System.out.println(minute);

        //    获取秒数
        int second = now.getSecond();
        System.out.println(second);

        DayOfWeek dayOfWeek = now.getDayOfWeek();
        int value1 = dayOfWeek.getValue();
        System.out.println(dayOfWeek + "===" + value1);

        int dayOfYear = now.getDayOfYear();
        System.out.println(dayOfYear);
    }
}
