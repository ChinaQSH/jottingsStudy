package com.qsh.study.time;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Period;

/**
 * <p>
 *
 * @author: mini
 * @Date: 2022-04-22 15:17
 * @Description:
 */

public class java8LocalTimeDemo10 {
    /**
     *功能描述
     * Period类 - 用于计算两个“日期”间隔的类
     * Period 在概念上和 Duration 类似，区别在于 Period 是以年月日来衡量一个时间段。Duration 用于计算两个时间间隔，Period 用于计算两个日期间隔，所以 between() 方法只能接收 LocalDate 类型的参数。
     *
     * 静态方法 between()：计算两个日期之间的间隔
     * getYears()：获取年份
     * getMonths()：获取月份
     * getDays()：获取天数
     */

    @Test
    public void test(){
        //计算两个日期的间隔
        LocalDate birthday = LocalDate.of(2012, 12, 12);
        LocalDate now = LocalDate.now();

        //我从出生到现在，有多少岁，零几个月，几天
        //计算两个日期的间隔
        Period between = Period.between(birthday, now);
        int years = between.getYears();
        int months = between.getMonths();
        int days = between.getDays();
        System.out.println("玛雅人的地球都消灭了" + years + "年" + months + "月" + days + "天了...");
    }
}
