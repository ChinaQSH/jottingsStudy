package cn.qsh.design.service;

import java.util.concurrent.TimeUnit;

/**
 * <p>
 *
 * @author: mini
 * @Date: 2022-06-27 11:24
 * @Description:
 */
public interface CacheService {

    String get(final String key, int redisType);

    void set(String key, String value, int redisType);

    void set(String key, String value, long timeout, TimeUnit timeUnit, int redisType);

    void del(String key, int redisType);
}
