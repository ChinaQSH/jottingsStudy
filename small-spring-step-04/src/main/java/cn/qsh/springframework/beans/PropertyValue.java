package cn.qsh.springframework.beans;

/**
 * <p>
 *
 * @author: mini
 * @Date: 2022-06-17 10:37
 * @Description:
 */

public class PropertyValue {
    private final String name;
    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }


}
