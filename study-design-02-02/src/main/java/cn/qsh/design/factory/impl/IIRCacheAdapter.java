package cn.qsh.design.factory.impl;

import cn.qsh.design.factory.ICacheAdapter;
import cn.qsh.design.matter.IIR;

import java.util.concurrent.TimeUnit;

/**
 * <p>
 *
 * @author: mini
 * @Date: 2022-06-27 14:29
 * @Description:
 */

public class IIRCacheAdapter implements ICacheAdapter {

    private IIR iir = new IIR();

    public String get(String key) {
        return iir.get(key);
    }

    public void set(String key, String value) {
        iir.set(key, value);
    }

    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        iir.setExpire(key, value, timeout, timeUnit);
    }

    public void del(String key) {
        iir.del(key);
    }

}
