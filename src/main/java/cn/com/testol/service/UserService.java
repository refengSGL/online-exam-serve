package cn.com.testol.service;


import cn.com.testol.entity.User;
import cn.com.testol.utils.Msg;

public interface UserService {
    //登陆
    public User login(String name, String password);

    //查找
    public User getUserById(int u_id);

    public Msg queryUserByC_id(int c_id, int userId);

    //注册
    public Msg addUser(User user,String password);

    public Msg getRole(Integer userId);

    //修改用户信息
    public int updateUser(User user);
}
