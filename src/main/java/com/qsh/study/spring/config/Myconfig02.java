package com.qsh.study.spring.config;

import com.qsh.study.spring.config.controller.BookController;
import com.qsh.study.spring.config.service.BookService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * <p>
 *
 * @author: mini
 * @Date: 2022-04-25 16:34
 * @Description:
 */
@Configuration
// @ComponentScans(value = {@ComponentScan()})
@ComponentScan(value ="com.qsh",excludeFilters = {@Filter(type= FilterType.ANNOTATION,classes ={BookController.class, BookService.class} ) },useDefaultFilters = false)
public class Myconfig02 {
}
