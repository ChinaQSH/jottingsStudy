package com.qsh.study.time;

import org.junit.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

/**
 * <p>
 *
 * @author: mini
 * @Date: 2022-04-22 14:06
 * @Description:
 */

public class testTemporalAdjuster {
    /**
     *功能描述
     * emporalAdjuster接口 - 时间调节器
     * 前面看到的所有日期操作都是相对比较直接的。有的时候，你需要进行一些更加灵活复杂的操作，比如，将日期调整到下个周日、
     * 下个工作日，或者是本月的最后一天。这时，就需要时间调节器 TemporalAdjuster，可以更加灵活地处理日期。TemporalAdjusters 工具提供了一些通用的功能，
     * 并且你还可以新增你自己的功能。
     */

    @Test
    public void testTemporalAdjuster() {
        LocalDate now = LocalDate.now();
        //指定日期
        //对于一些特殊的日期，可以通过一个工具类TemporalAdjusters 来指定
        //见名知意，本月第一天
        TemporalAdjuster temporalAdjuster = TemporalAdjusters.firstDayOfMonth();
        LocalDate with = now.with(temporalAdjuster);
        System.out.println(with);
        //下周周末
        TemporalAdjuster next = TemporalAdjusters.next(DayOfWeek.SUNDAY);
        LocalDate with1 = now.with(next);
        System.out.println(with1);
        System.out.println("===================================");
        LocalDate now1 = LocalDate.now();
        //自定义日期 - 下一个工作日
        LocalDate with2 = now1.with(new TemporalAdjuster() {
            @Override
            //参数 nowDate 当前的日期对象
            public Temporal adjustInto(Temporal nowDate) {
                //向下转型
                LocalDate date = (LocalDate) nowDate;
                if (date.getDayOfWeek().equals(DayOfWeek.FRIDAY)) {
                    LocalDate localDate = date.plusDays(3);
                    return localDate;
                } else if (date.getDayOfWeek().equals(DayOfWeek.SATURDAY)) {
                    LocalDate localDate = date.plusDays(2);
                    return localDate;
                } else {
                    LocalDate localDate = date.plusDays(1);
                    return localDate;
                }
            }
        });
        System.out.println("下一个工作日是：" + with2);
    }
}
