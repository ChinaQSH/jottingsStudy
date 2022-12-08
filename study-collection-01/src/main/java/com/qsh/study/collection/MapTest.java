package com.qsh.study.collection;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * <p>
 *
 * @author: mini
 * @Date: 2022-08-26 15:58
 * @Description:
 */

public class MapTest {

    public static void main(String[] args) {
        // HashMap<String, String> map = new HashMap<>();
        // map.put("1","one");
        // map.put("4","four");
        // map.put("2","two");
        // System.out.println("map===="+map);
        // Set<Map.Entry<String, String>> entries = map.entrySet();
        // System.out.println("entries==="+entries);
        // for (Map.Entry<String, String> entries1:entries){
        //     System.out.println(entries1);
        //     System.out.println(entries1.getKey());
        // }
        String startTime="2022-08-28";
        Date date = DateUtil.formatStrToDate(DateUtil.FORMAT3, startTime);
        System.out.println(date);
        startTime=DateUtil.getDateByFormat(DateUtil.formatStrToDate(DateUtil.FORMAT3,startTime),DateUtil.FORMAT7);
        System.out.println(startTime);






    }
}
