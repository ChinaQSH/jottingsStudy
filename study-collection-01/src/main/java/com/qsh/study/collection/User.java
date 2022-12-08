package com.qsh.study.collection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 *
 * @author: mini
 * @Date: 2022-08-05 15:38
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;
    private String age;
    private Integer id;
}
