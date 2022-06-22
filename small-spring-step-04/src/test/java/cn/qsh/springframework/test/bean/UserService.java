package cn.qsh.springframework.test.bean;

/**
 * <p>
 *
 * @author: mini
 * @Date: 2022-06-17 10:38
 * @Description:
 */

public class UserService {

    private String uId;
    private UserDao userDao;

    public void queryUserInfo() {
        System.out.println("查询用户信息：" + userDao.queryUserName(uId));
    }
}
