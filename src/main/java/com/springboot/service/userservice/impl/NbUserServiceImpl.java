package com.springboot.service.userservice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.bean.user.User;
import com.springboot.dao.UserDao;
import com.springboot.service.userservice.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Transactional
    public void save(User user) {
        userDao.save(user);
    }

    public List<User> findAll() {
        System.out.println("yun行了findall()");
        return userDao.findAll();
    }

}
