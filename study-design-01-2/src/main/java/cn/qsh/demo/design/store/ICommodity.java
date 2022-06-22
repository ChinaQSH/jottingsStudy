package cn.qsh.demo.design.store;

import java.util.Map;

/**
 * <p>
 *
 * @author: mini
 * @Date: 2022-06-22 17:20
 * @Description:
 */

public interface ICommodity {

    void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception;
}
