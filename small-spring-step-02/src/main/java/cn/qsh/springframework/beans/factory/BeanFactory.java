package cn.qsh.springframework.beans.factory;

/**
 * <p>
 *
 * @author: mini
 * @Date: 2022-04-27 10:13
 * @Description:
 */

public interface BeanFactory {
    Object getBean(String name) throws BeansException;
}
