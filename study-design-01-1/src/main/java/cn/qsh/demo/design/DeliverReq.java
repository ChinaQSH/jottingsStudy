package cn.qsh.demo.design;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 *
 * @author: mini
 * @Date: 2022-06-22 16:01
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeliverReq {
    private String userName;
    private String userPhone;
    private String sku;
    private String orderId;
    private String consigneeUserName;
    private String consigneeUserPhone;
    private String consigneeUserAddress;


}
