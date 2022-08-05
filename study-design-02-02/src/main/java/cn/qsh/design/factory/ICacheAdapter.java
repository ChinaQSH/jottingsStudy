package cn.qsh.design.factory;

import java.util.concurrent.TimeUnit;

/**
 * <p>
 *
 * @author: mini
 * @Date: 2022-06-27 14:13
 * @Description:
 */
public interface ICacheAdapter {
    String get(String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);
}
