package com.qsh.study.time;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * <p>
 *
 * @author: mini
 * @Date: 2022-04-22 13:48
 * @Description:
 */

public class java8LocalTimeDemo7 {
    /**
     *功能描述
     *
     *
     * 将日期格式化为字符串的方法
     * format()：格式化字符串
     */
    @Test
    public void test(){
        //获取当前日期时分秒
        LocalDateTime now = LocalDateTime.now();

        //默认格式  年-月-日T时:分:秒
        System.out.println(now);

        //指定格式
        DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒");
        //传入格式
        String dateStr = now.format(ofPattern);
        System.out.println(dateStr);
    }
}
