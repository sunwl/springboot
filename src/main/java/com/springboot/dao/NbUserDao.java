package com.springboot.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.bean.user.User;

@Transactional
@Repository
public interface UserDao extends CommonDao<User> {

}
