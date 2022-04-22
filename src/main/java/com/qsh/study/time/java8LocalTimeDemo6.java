package com.qsh.study.time;

import org.junit.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/**
 * <p>
 *
 * @author: mini
 * @Date: 2022-04-22 13:34
 * @Description:
 */

public class java8LocalTimeDemo6 {
    /**
     * 功能描述
     * <p>
     * 指定年月日时分秒的方法
     * with(TemporalAdjuster adjuster):指定特殊时间
     * withYear(int year):指定年
     * withDayOfYear(int dayOfYear):指定日
     * withMonth(int month):指定月
     * withDayOfMonth(int dayOfMonth):指定日
     */
    @Test
    public void test() {
        //指定某个日期的方法 with()方法
        LocalDate now2 = LocalDate.now();
        System.out.println(now2);
        LocalDate localDate = now2.withYear(2014);
        System.out.println(localDate);

        // TemporalAdjusters工具类，提供了一些获取特殊日期的方法
        LocalDate with = now2.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(with);
        LocalDate with1 = now2.with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println(with1);

        //获取这个月的第几个星期几是几号,比如 TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.FRIDAY)
        // 代表的意思是这个月的第二个星期五是几号
        LocalDate with2 = now2.with(TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.FRIDAY));
        System.out.println(with2);
    }
}
