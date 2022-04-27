package cn.qsh.springframework.beans.factory;

/**
 * <p>
 *
 * @author: mini
 * @Date: 2022-04-27 10:03
 * @Description:
 */

public class BeansException extends RuntimeException{
    private static final long serialVersionUID = 1324161043093044028L;

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
