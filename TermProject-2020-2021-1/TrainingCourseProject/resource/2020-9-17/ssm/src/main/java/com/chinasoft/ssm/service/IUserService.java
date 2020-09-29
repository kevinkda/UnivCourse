package com.chinasoft.ssm.service;

import com.chinasoft.ssm.domain.User;

import java.util.List;

public interface IUserService {

    public List<User> selectUserList();
}
