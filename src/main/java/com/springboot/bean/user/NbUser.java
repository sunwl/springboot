package com.springboot.bean.user;

import com.springboot.bean.base.BaseBean;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "test")
public class User extends BaseBean {

    private String name;
    private int age;
    private String info;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", age=" + age + ", info=" + info + ", id=" + getId() + "]";
    }


}
