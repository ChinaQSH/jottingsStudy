package cn.qsh.demo.design.store.entiry;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * <p>
 * 不使用设计模式
 *
 * @author: mini
 * @Date: 2022-06-22 15:28
 * @Description: 不使用设计模式
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AwardReq {
    private Integer awardType;
    private String uId;
    private String awardNumber;
    private String bizId;

    private Map<String,String> extMap;



}
