package com.visitor.dao;

import com.visitor.model.Admin;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import static com.visitor.util.VisitorConstants.ADMINTABLE;

public interface AdminDao {

    //根据登录名和密码查询员工
    @Select("select * from "+ADMINTABLE+" where loginname=#{admin_loginname} and password=#{admin_password}")
    Admin selectByLoginnameAndPassword(@Param("loginname") String loginname,
                                       @Param("password") String password);




}
