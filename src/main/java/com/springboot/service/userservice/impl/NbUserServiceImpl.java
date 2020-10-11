package com.springboot.service.userservice.impl;

import com.springboot.bean.user.NbUser;
import com.springboot.dao.NbUserDao;
import com.springboot.service.userservice.NbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class NbUserServiceImpl implements NbUserService {

    @Autowired
    private NbUserDao nbUserDao;

    @Transactional
    public void save(NbUser user) {
        nbUserDao.save(user);
    }

    public List<NbUser> findAll() {
        System.out.println("nbUserDao+++++yun行了findall()");
        return nbUserDao.findAll();
    }

}
