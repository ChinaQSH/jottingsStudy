package cn.qsh.design;

import cn.qsh.design.service.CacheService;
import cn.qsh.design.service.impl.CacheServiceImpl;
import org.junit.Test;

/**
 * <p>
 *
 * @author: mini
 * @Date: 2022-06-27 13:46
 * @Description:
 */

public class ApiTest {
    @Test
    public void test_CacheService() {
        CacheService cacheService = new CacheServiceImpl();
        cacheService.set("useName", "qsh", 1);
        String val01 = cacheService.get("useName", 1);
        System.out.println("测试结果：" + val01);
    }


}
