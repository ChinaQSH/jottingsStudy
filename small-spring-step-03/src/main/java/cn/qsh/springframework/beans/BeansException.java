package cn.qsh.springframework.beans;

/**
 * <p>
 *
 * @author: mini
 * @Date: 2022-06-16 15:31
 * @Description:
 */

public  class BeansException extends RuntimeException{

    private static final long serialVersionUID = 4571307650038119462L;

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
