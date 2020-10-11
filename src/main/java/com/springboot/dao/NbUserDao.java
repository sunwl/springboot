package com.springboot.dao;

import com.springboot.bean.user.NbUser;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface NbUserDao extends CommonDao<NbUser> {

}
