package cn.qsh.design;

import cn.qsh.design.factory.JDKProxy;
import cn.qsh.design.factory.impl.EGMCacheAdapter;
import cn.qsh.design.factory.impl.IIRCacheAdapter;
import cn.qsh.design.service.CacheService;
import cn.qsh.design.service.impl.CacheServiceImpl;
import org.junit.Test;

/**
 * <p>
 *
 * @author: mini
 * @Date: 2022-06-27 14:31
 * @Description:
 */

public class ApiTest {

    @Test
    public void test_CacheService() throws Exception {

        CacheService proxy_EGM = JDKProxy.getProxy(CacheServiceImpl.class, new EGMCacheAdapter());
        proxy_EGM.set("userName", "qsh");
        String val01 = proxy_EGM.get("userName");
        System.out.println("测试结果：" + val01);

        CacheService proxy_IIR = JDKProxy.getProxy(CacheServiceImpl.class, new IIRCacheAdapter());
        proxy_IIR.set("userName", "qsh");
        String val02 = proxy_IIR.get("userName");
        System.out.println("测试结果：" + val02);

    }
}
