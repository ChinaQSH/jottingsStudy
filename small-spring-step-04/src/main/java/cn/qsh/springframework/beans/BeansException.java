package cn.qsh.springframework.beans;

/**
 * <p>
 *
 * @author: mini
 * @Date: 2022-06-17 10:36
 * @Description:
 */

public class BeansException extends RuntimeException{

    private static final long serialVersionUID = -4506404558466371553L;

    public BeansException(String message, Throwable cause) {
        super(message, cause);
    }

    public BeansException(String msg){
        super(msg);
    }
}
