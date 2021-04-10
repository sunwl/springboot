package com.springboot.dao;

import com.springboot.bean.user.User;
import com.springboot.bean.user.UserSee;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public interface UserDao extends CommonDao<User> {

    // 使用hql查询
    @Query("from User u where u.name=:name")//:name对应@Param里的name
    User findByHQL(@Param("name") String name);

    // 使用sql查询
    @Query(value = "select  * from t_user where name=? ",nativeQuery = true)
    public User findBySQL(String name);
    @Modifying
    @Query("update  User t  set t.passw= :passw where t.id= :id")
    public int setpasswd(@Param("passw") String paw,@Param("id")Long id);

    @Query(value = "select  c.name name,c.age age,c.info info,c.passw passw,e.v_desc v_desc,e.v_date v_date,e.info v_info from t_user c left join  see e on c.id=e.id ",nativeQuery = true)
    public List<UserSee> getUserSee();


}
