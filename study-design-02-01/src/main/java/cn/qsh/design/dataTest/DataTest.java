package cn.qsh.design.dataTest;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * <p>
 *
 * @author: mini
 * @Date: 2022-06-29 14:03
 * @Description:
 */

public class DataTest {

    @Test
    public void test_Data_Calendar() throws ParseException {
        String str = "2022-06-29 14:06:01";
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date simpleDateFormat = simpleDateFormat1.parse(str);

        String str1 = "2021-06-29 14:06:01";
        Date parse = simpleDateFormat1.parse(str1);
        System.out.println(simpleDateFormat);

        Calendar instance = Calendar.getInstance();
        instance.setTime(simpleDateFormat);
        System.out.println("-----------------------------------------------");
        System.out.println(instance.getTime());
        System.out.println(simpleDateFormat1.format(instance.getTime()));
        instance.add(Calendar.MONTH, 1);
        System.out.println("-----------------------------------------------");
        System.out.println(instance.getTime());
        System.out.println(simpleDateFormat1.format(instance.getTime()));

        List<Date> monthDateList = getMonthDateList(parse, simpleDateFormat);
        System.out.println(monthDateList);
    }


    public static List<Date> getMonthDateList(Date startDate, Date endDate) {

        List<Date> result = new ArrayList<Date>();
        Calendar tempStart = Calendar.getInstance();
        tempStart.setTime(startDate);

        SimpleDateFormat sdf = new SimpleDateFormat("dd");
        String dayStr = sdf.format(startDate);
        int day = Integer.valueOf(sdf.format(startDate));
        if (day > 1) {
            tempStart.add(Calendar.MONTH, 1);
        }

        Calendar tempEnd = Calendar.getInstance();
        tempEnd.setTime(endDate);
        while (tempStart.before(tempEnd)) {
            tempStart.set(Calendar.DATE, 1);
            result.add(tempStart.getTime());
            tempStart.add(Calendar.MONTH, 1);
        }
        return result;
    }

    @Test
    public void testDateTime() {


    }


}
