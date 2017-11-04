package com.visitor.service;

import com.visitor.model.Admin;

public interface AdminService {

    Admin login(String loginname,String password);

}
