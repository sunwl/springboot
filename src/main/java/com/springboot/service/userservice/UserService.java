package com.springboot.service.userservice;

import com.springboot.bean.user.User;
import com.springboot.bean.user.UserSee;

import java.util.List;

public interface UserService {

    /**
     * 保存用户对象
     *
     * @param user
     */
    public void save(User user);
    public User find(String username);
    public User find(String username,String usepass);
    List<User> findAll();
    public User findBySQL(String name);
    public int setpasswd(String paw,Long id);
    public List<UserSee> getUserSee();
}
