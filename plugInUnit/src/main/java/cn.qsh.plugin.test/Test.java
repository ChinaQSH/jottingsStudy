package cn.qsh.plugin.test;

/**
 * <p>
 *
 * @author: mini
 * @Date: 2022-07-14 13:22
 * @Description:
 */

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        Person person1 = new Person();
        User user = new User();
        user.setName(person.getPerSongName());
        user.setAge(person.getPerSonAge());
        user.setFirstName(person.getPerChildName());
        System.out.println(user.toString());

    }
}
