package cn.qsh.design.service.impl;

import cn.qsh.design.matter.EGM;
import cn.qsh.design.matter.IIR;
import cn.qsh.design.service.CacheService;
import cn.qsh.design.util.RedisUtils;

import java.util.concurrent.TimeUnit;

/**
 * <p>
 *
 * @author: mini
 * @Date: 2022-06-27 11:28
 * @Description:
 */

public class CacheServiceImpl implements CacheService {
    private RedisUtils redisUtils = new RedisUtils();


    private EGM egm = new EGM();

    private IIR iir = new IIR();

    public String get(String key, int redisType) {

        if (1 == redisType) {
            return egm.gain(key);
        }

        if (2 == redisType) {
            return iir.get(key);
        }

        return redisUtils.get(key);
    }

    public void set(String key, String value, int redisType) {

        if (1 == redisType) {
            egm.set(key, value);
            return;
        }

        if (2 == redisType) {
            iir.set(key, value);
            return;
        }

        redisUtils.set(key, value);
    }

    public void set(String key, String value, long timeout, TimeUnit timeUnit, int redisType) {

        if (1 == redisType) {
            egm.setEx(key, value, timeout, timeUnit);
            return;
        }

        if (2 == redisType) {
            iir.setExpire(key, value, timeout, timeUnit);
            return;
        }

        redisUtils.set(key, value, timeout, timeUnit);
    }

    public void del(String key, int redisType) {

        if (1 == redisType) {
            egm.delete(key);
            return;
        }

        if (2 == redisType) {
            iir.del(key);
            return;
        }

        redisUtils.del(key);
    }
}
