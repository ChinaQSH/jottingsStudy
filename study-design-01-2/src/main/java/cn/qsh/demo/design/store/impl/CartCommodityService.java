package cn.qsh.demo.design.store.impl;

import cn.qsh.demo.design.store.ICommodity;
import cn.qsh.demo.design.store.entiry.IQiYiCardService;
import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * <p>
 *
 * @author: mini
 * @Date: 2022-06-22 17:19
 * @Description:
 */

public class CartCommodityService implements ICommodity {
    private Logger logger = LoggerFactory.getLogger(CartCommodityService.class);

    // 模拟注入
    private IQiYiCardService iQiYiCardService = new IQiYiCardService();

    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        String mobile = queryUserMobile(uId);
        iQiYiCardService.grantToken(mobile, bizId);
        logger.info("请求参数[爱奇艺兑换卡] => uId：{} commodityId：{} bizId：{} extMap：{}", uId, commodityId, bizId, JSON.toJSON(extMap));
        logger.info("测试结果[爱奇艺兑换卡]：success");
    }

    private String queryUserMobile(String uId) {
        return "15200101232";
    }

}
