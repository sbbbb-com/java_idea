package cn.itcast.service.impl;

import cn.itcast.domain.User;
import cn.itcast.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Override
    public List<User> findAll() {
        //调用Dao完成查询

        System.out.println("test数据库层");
        return null;

    }
}
