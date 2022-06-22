package cn.qsh.springframework.test.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *
 * @author: mini
 * @Date: 2022-06-17 10:38
 * @Description:
 */

public class UserDao {

  private static Map<String, String> hashMap =new HashMap<>();

  static{
      hashMap.put("10001","qsh");
      hashMap.put("10002","zxs");
      hashMap.put("10003","nsn");
  }

  public String queryUserName(String uId){
      return hashMap.get(uId);
  }

}
