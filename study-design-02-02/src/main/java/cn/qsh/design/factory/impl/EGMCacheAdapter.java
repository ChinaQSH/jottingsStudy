package cn.qsh.design.factory.impl;

import cn.qsh.design.factory.ICacheAdapter;
import cn.qsh.design.matter.EGM;

import java.util.concurrent.TimeUnit;

/**
 * <p>
 *
 * @author: mini
 * @Date: 2022-06-27 14:25
 * @Description:
 */

public class EGMCacheAdapter implements ICacheAdapter {
    private EGM egm = new EGM();

    public String get(String key) {
        return egm.gain(key);
    }

    public void set(String key, String value) {
        egm.set(key, value);
    }

    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        egm.setEx(key, value, timeout, timeUnit);
    }

    public void del(String key) {
        egm.delete(key);
    }
}
