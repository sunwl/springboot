package com.springboot.service.connservice.impl;

import com.springboot.bean.user.MySee;
import com.springboot.bean.user.User;
import com.springboot.dao.SeeDao;
import com.springboot.dao.UserDao;
import com.springboot.service.connservice.SeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SeeServiceImpl implements SeeService {

    @Autowired
    private SeeDao seeDao;

    @Transactional
    public void save(MySee see) {
        seeDao.save(see);
    }

    public List<MySee> findAll() {
        System.out.println("yun行了findall()");
        return seeDao.findAll();
    }

}
