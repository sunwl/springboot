package com.springboot.dao;

import com.springboot.bean.user.MySee;
import com.springboot.bean.user.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface SeeDao extends CommonDao<MySee> {

}
