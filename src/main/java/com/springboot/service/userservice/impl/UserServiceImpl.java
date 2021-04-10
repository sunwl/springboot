package com.springboot.service.userservice.impl;

import com.springboot.bean.user.User;
import com.springboot.bean.user.UserSee;
import com.springboot.dao.UserDao;
import com.springboot.service.userservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Transactional
    public void save(User user) {
        userDao.save(user);
    }

    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User findBySQL(String name) {
        return userDao.findBySQL(name);
    }

    @Override
    public int setpasswd(String paw, Long id) {
        return userDao.setpasswd(paw, id);
    }

    @Override
    public List<UserSee> getUserSee() {

        return userDao.getUserSee();
    }

    @Override
    public User find(String username, String usepass) {
        User user = findBySQL(username);
        if (user != null) {
            return user;


        } else {
            return user;
        }
    }

    @Override
    public User find(String username) {
        return userDao.findByHQL(username);
    }
}
