package cn.qsh.plugin.test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 *
 * @author: mini
 * @Date: 2022-07-14 13:17
 * @Description:
 */
// @Data
// @NoArgsConstructor
// @AllArgsConstructor
public class Person {
    private String perSongName;
    private String perSonAge;
    private String perChildName;

    public String getPerSongName() {
        return perSongName;
    }

    public void setPerSongName(String perSongName) {
        this.perSongName = perSongName;
    }

    public String getPerSonAge() {
        return perSonAge;
    }

    public void setPerSonAge(String perSonAge) {
        this.perSonAge = perSonAge;
    }

    public String getPerChildName() {
        return perChildName;
    }

    public void setPerChildName(String perChildName) {
        this.perChildName = perChildName;
    }
}
