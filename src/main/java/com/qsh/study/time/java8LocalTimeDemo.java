package com.qsh.study.time;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * <p>
 * jdk8时间处理的api
 *
 * @author: mini
 * @Date: 2022-04-22 10:27
 * @Description: jdk8时间处理的api
 */

/**
 * 功能描述
 * <p>
 * LocalDate、LocalTime、LocalDateTime
 * java.time.LocalDate 用于表示 “本地日期”，无 “时间”。LocalDate 不承载时区信息。
 * java.time.LocalTime 用于表示 “本地时间”，无 “日期”。LocalTime 不承载时区信息。
 * java.time.LocalDateTime 用于表示 “本地日期与时间”。LocalDateTime 不承载时区信息。
 * LocalDate 实例与 LocalTime 实例能够共同构建 LocalDateTime 实例，由 LocalDateTime 实例能够获取 LocalDate 实例与 LocalTime 实例。
 * 由于 LocalDateTime 不承载时区信息，因此，其不能与 Instant 相互转换，必须提供时区信息。
 * 获取对象的方法
 * 获取对象的方法：
 * 通过静态方法 ：now()（获取的时间是系统当前的时间）
 * 通过静态方法：of()（方法参数可以指定时间）
 */
public class java8LocalTimeDemo {
    @Test
    public void test01() {

        /* 通过静态方法 now() 返回该类的实例 */
        //获取当前的日期时分秒
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        //获取当前日期
        LocalDate now1 = LocalDate.now();
        System.out.println(now1);

        //获取当前时分秒
        LocalTime now2 = LocalTime.now();
        System.out.println(now2);

        System.out.println("=========================================");

        /* 静态方法 of() 返回该类的实例 */
        //指定日期时分秒
        LocalDateTime localDateTime = LocalDateTime.of(2048, 11, 25, 12, 00, 30);
        System.out.println(localDateTime);

        //指定日期
        LocalDate date = LocalDate.of(2020, 12, 12);
        System.out.println(date);

        //指定时分秒
        LocalTime time = LocalTime.of(14, 20, 30);
        System.out.println(time);
    }


}
