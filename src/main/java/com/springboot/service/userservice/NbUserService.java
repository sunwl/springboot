package com.springboot.service.userservice;

import com.springboot.bean.user.NbUser;

import java.util.List;

public interface NbUserService {

    /**
     * 保存用户对象
     *
     * @param user
     */
    void save(NbUser user);

    List<NbUser> findAll();
}
