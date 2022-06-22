package cn.qsh.demo.design;

import cn.qsh.demo.design.store.ICommodity;
import cn.qsh.demo.design.store.impl.CartCommodityService;
import cn.qsh.demo.design.store.impl.CouponCommodityService;
import cn.qsh.demo.design.store.impl.GoodsCommodityService;

/**
 * <p>
 *
 * @author: mini
 * @Date: 2022-06-22 17:21
 * @Description:
 */

public class StoreFactory {
    public ICommodity getCommodityService(Integer commodityType) {
        if (null == commodityType) return null;
        if (1 == commodityType) return new CouponCommodityService();
        if (2 == commodityType) return new GoodsCommodityService();
        if (3 == commodityType) return new CartCommodityService();
        throw new RuntimeException("不存在的商品服务类型");
    }
}
