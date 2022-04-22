package com.qsh.study.time;

import org.junit.Test;

import java.time.LocalDate;

/**
 * <p>
 *
 * @author: mini
 * @Date: 2022-04-22 13:12
 * @Description:
 */

public class java8LocalTimeDemo4 {
    /**
     * 功能描述
     * <p>
     * 判断的方法
     * isAfter()：判断一个日期是否在指定日期之后
     * isBefore()：判断一个日期是否在指定日期之前
     * isEqual()：判断两个日期是否相同
     * isLeapYear()：判断是否是闰年（注意是LocalDate类 和 LocalDateTime类特有的方法）
     */
    @Test
    public void test() {
        LocalDate now = LocalDate.now();

        LocalDate of = LocalDate.of(2015, 12, 12);
        LocalDate of1 = LocalDate.of(2016, 12, 12);

        //判断一个日期是否在另一个日期之前
        boolean before = of.isBefore(now);
        System.out.println(before);

        //    判断一个日期是否在另一个日期之后
        boolean after = of.isAfter(now);
        System.out.println(after);

        //判断这两个日期是否相等
        boolean after1 = now.equals(of);
        System.out.println(after1);

        //判断闰年
        boolean leapYear = of.isLeapYear();
        System.out.println(leapYear);

        boolean leap1Year = of1.isLeapYear();
        System.out.println(leap1Year);


    }
}
