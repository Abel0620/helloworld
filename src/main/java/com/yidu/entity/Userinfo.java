package com.yidu.entity;

import java.io.Serializable;

/**
 * (Userinfo)实体类
 *
 * @author makejava
 * @since 2021-04-12 10:30:38
 */
public class Userinfo implements Serializable {
    private static final long serialVersionUID = -77294686762767249L;
    
    private Integer pid;
    
    private String uname;
    
    private String upass;
    
    private Integer age;
    
    private String sex;
    
    private Object height;


    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpass() {
        return upass;
    }

    public void setUpass(String upass) {
        this.upass = upass;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Object getHeight() {
        return height;
    }

    public void setHeight(Object height) {
        this.height = height;
    }

}