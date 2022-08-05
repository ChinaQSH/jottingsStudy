package com.qsh.study.demo;

import com.alibaba.fastjson.JSONObject;

/**
 * <p>
 *
 * @author: mini
 * @Date: 2022-07-18 14:17
 * @Description:
 */

public class FastJsonTest {

    public static void main(String[] args) {
        String str="{\"type\":\"ProjectView\",\"data\":{\"proId\":\"202207181430111\",\"matId\":110,\"localProjectId\":\"1\",\"devName\":\"adminruiyue\",\"lastModifyTime\":1657866490057,\"channelId\":110,\"versionNo\":\"6.0.1.1\",\"startTime\":\"2022-07-10 10:10:10\",\"endTime\":\"2022-07-15 10:10:10\",\"browser\":1,\"identity\":\"321321\",\"mac\":\"0353445344313238855b31265f015c\"}}";

        JSONObject parse = (JSONObject) JSONObject.parse(str);
        JSONObject data = parse.getJSONObject("data");
        System.out.println(data);


        String devName = parse.getString("devName");
        String devName1 = data.getString("devName");
        String devName2 = data.getString("devName123");
        System.out.println(devName);
        System.out.println(devName1);
        System.out.println(devName2);
    }
}
