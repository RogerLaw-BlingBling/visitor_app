package com.visitor.model;

import java.io.Serializable;

public class Admin implements Serializable{

    private Integer adminId;
    private String adminName;
    private String loginName;
    private String password;


    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Admin() {
    }

    public Admin(Integer adminId, String adminName, String loginName, String password) {
        this.adminId = adminId;
        this.adminName = adminName;
        this.loginName = loginName;
        this.password = password;
    }
}
