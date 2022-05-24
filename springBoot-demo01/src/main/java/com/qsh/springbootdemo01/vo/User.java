package com.qsh.springbootdemo01.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.io.Serializable;

/**
 * <p>
 * user
 *
 * @author: mini
 * @Date: 2022-05-19 11:07
 * @Description: user
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ConfigurationProperties(prefix = "com.qsh")
public class User implements Serializable {
    private String name;
    private Integer age;
}
