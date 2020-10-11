package com.springboot.bean.user;

import com.springboot.bean.base.BaseBean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "NB_USER")
public class NbUser extends BaseBean {

    private String userid;
    @Column(name = "name", nullable = true, length = 80)
    private String name;
    private String passw;
    private String info;
    private String tellno;
    private String email;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassw() {
        return passw;
    }

    public void setPassw(String passw) {
        this.passw = passw;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getTellno() {
        return tellno;
    }

    public void setTellno(String tellno) {
        this.tellno = tellno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public NbUser(String userid, String name, String passw, String info, String tellno, String email) {
        this.userid = userid;
        this.name = name;
        this.passw = passw;
        this.info = info;
        this.tellno = tellno;
        this.email = email;
    }

    public NbUser() {
    }

    @Override
    public String toString() {
        return "NbUser{" +
                "userid='" + userid + '\'' +
                ", name='" + name + '\'' +
                ", passw='" + passw + '\'' +
                ", info='" + info + '\'' +
                ", tellno='" + tellno + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
