package com.springboot.service.userservice;

import java.util.List;

import com.springboot.bean.user.User;

public interface UserService {

    /**
     * 保存用户对象
     *
     * @param user
     */
    void save(User user);

    List<User> findAll();
}
