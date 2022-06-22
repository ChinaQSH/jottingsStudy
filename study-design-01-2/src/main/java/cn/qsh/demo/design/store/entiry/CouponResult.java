package cn.qsh.demo.design.store.entiry;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * <p>
 *
 * @author: mini
 * @Date: 2022-06-22 15:56
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class CouponResult {
    private String code;
    private String info;
}
