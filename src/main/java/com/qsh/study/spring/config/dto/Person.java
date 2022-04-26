package com.qsh.study.spring.config.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * <p>
 *
 * @author: mini
 * @Date: 2022-04-25 16:10
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person implements Serializable {
    private static final long serialVersionUID = -93524967727662910L;

    private Integer id;

    private String name;
}
