package com.springboot.bean.user;

import com.springboot.bean.base.BaseBean;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "See")
public class MySee extends BaseBean {


    private String info;
    private String v_desc;
    private String v_date;

    public String getV_date() {
        return v_date;
    }

    public void setV_date(String v_date) {
        this.v_date = v_date;
    }

    public String getV_desc() {
        return v_desc;
    }

    public void setV_desc(String v_desc) {
        this.v_desc = v_desc;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "MySee{" +
                "info='" + info + '\'' +
                ", v_desc='" + v_desc + '\'' +
                ", v_date='" + v_date + '\'' +
                '}';
    }
}
