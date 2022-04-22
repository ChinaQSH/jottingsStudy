package com.qsh.study.time;

import org.junit.Test;

import java.time.Duration;
import java.time.Instant;

/**
 * <p>
 *
 * @author: mini
 * @Date: 2022-04-22 15:11
 * @Description:
 */

public class java8LocalTimeDemo9 {
    /**
     *功能描述
     * Duration 表示一个时间段，Duration 包含两部分：seconds 表示秒，nanos 表示纳秒，它们的组合表达了时间长度。
     * 因为 Duration 表示时间段，所以 Duration 类中不包含 now() 静态方法。注意，Duration 不包含毫秒这个属性。
     * Duration只能处理两个LocalTime, LocalDateTime, ZonedDateTime; 如果传入的是LocalDate，将会抛出异常
     *
     * 常用API：
     *
     * 静态方法 between()：计算两个时间的间隔，默认是秒
     * toDays()：将时间转换为以天为单位的
     * toHours()：将时间转换为以时为单位的
     * toMinutes()：将时间转换为以分钟为单位的
     * toMillis()：将时间转换为以毫秒为单位的
     * toNanos()：将时间转换为以纳秒为单位的
     */
    @Test
    public void test(){
        //计算时间的间隔
        Instant start = Instant.now();
        for (int i = 0; i < 100000; i++) {
            // System.out.println(i);
        }
        Instant end = Instant.now();
        Duration duration = Duration.between(start, end);
        long l = duration.toNanos();

        //间隔的时间
        System.out.println("循环耗时：" + l + "纳秒");
    }
}
