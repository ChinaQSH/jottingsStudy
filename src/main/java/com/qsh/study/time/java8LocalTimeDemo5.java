package com.qsh.study.time;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * <p>
 *
 * @author: mini
 * @Date: 2022-04-22 13:24
 * @Description:
 */

public class java8LocalTimeDemo5 {
    /**
     * 功能描述
     * <p>
     * <p>
     * 增减年月日时分秒的方法（plus/minus系列的方法）
     * 增加相关的方法
     * <p>
     * plusYears(int offset)：增加指定年份
     * plusMonths(int offset)：增加指定月份
     * plusWeeks(int offset)：增加指定周
     * plusDates(int offset)：增加指定日
     * plusHours(int offset)：增加指定时
     * plusMinuets(int offset)：增加指定分
     * plusSeconds(int offset)：增加指定秒
     * plusNanos(int offset)：增加指定纳秒
     * 减少相关的方法
     * <p>
     * minusYears(int offset)：减少指定年
     * minusMonths(int offset)：减少指定月
     * minusWeeks(int offset)：减少指定周
     * minusDates(int offset)：减少指定日
     * minusHours(int offset)：减少指定时
     * minusMinuets(int offset)：减少指定分
     * minusSeconds(int offset)：减少指定秒
     * minusNanos(int offset)：减少指定纳秒
     */


    @Test
    public void test() {
        //增加时间量的方法 plusXXX系类的方法 返回的是一个新的日期对象
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        //可以给当前的日期增加时间量
        LocalDateTime newDate = now.plusYears(1);
        int year = newDate.getYear();
        System.out.println(year);

        System.out.println("================================");
        //减去时间量的方法minusXXX 系列的方法 返回的是一个新的日期对象
        LocalDate now1 = LocalDate.now();
        System.out.println(now1);
        LocalDate newDate2 = now1.minusDays(10);
        System.out.println(newDate2);
        int dayOfMonth = newDate2.getDayOfMonth();
        System.out.println(dayOfMonth);
    }

}
