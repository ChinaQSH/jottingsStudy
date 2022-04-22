package com.qsh.study.time;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * <p>
 *
 * @author: mini
 * @Date: 2022-04-22 13:51
 * @Description:
 */

public class java8LocalTimeDemo8 {
    /**
     *功能描述
     *
     * 解析字符串为日期时间的方法
     * paser(String str)：将一个日期字符串解析成日期对象,注意字符串日期的写法的格式要正确,否则解析失败
     * paser(String str, DateTimeFormatter formatter)：将字符串按照参数传入的格式进行解析
     */

    @Test
    public void test06() {
        //给出一个符合默认格式要求的日期字符串
        String dateStr = "2020-01-01";

        //把日期字符串解析成日期对象 如果日期字符串时年月日 解析时用  LocalDate
        LocalDate parse = LocalDate.parse(dateStr);
        System.out.println(parse);

        System.out.println("===========================================");
        //给出一个符合默认格式要求的 时分秒 字符串
        String dateTimeStr = "14:20:30";

        //把 时分秒 字符串解析成时分秒对象
        LocalTime parse1 = LocalTime.parse(dateTimeStr);
        System.out.println(parse1);

        System.out.println("=========================================");
        //给出一个符合默认格式要求的 日期时分秒 字符串
        String str = "2018-12-12T14:20:30";

        //把 日期时分秒 字符串解析成时分秒对象
        LocalDateTime parse2 = LocalDateTime.parse(str);
        System.out.println(parse2);

        System.out.println("========================================");
        //给出一个自定义日期时分秒格式字符串
        String dateStr2 = "2020年12月12日 12:13:14";

        //给出一个自定义解析格式
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");

        //按照指定的格式去解析
        LocalDateTime parse3 = LocalDateTime.parse(dateStr2, formatter);
        System.out.println(parse3);
    }
}
