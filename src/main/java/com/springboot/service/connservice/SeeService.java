package com.springboot.service.connservice;

import com.springboot.bean.user.MySee;
import com.springboot.bean.user.User;

import java.util.List;

public interface SeeService {

    /**
     *
     *
     * @param user
     */
    void save(MySee user);

    List<MySee> findAll();
}
