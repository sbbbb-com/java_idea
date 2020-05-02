package cn.javawebs.service.impl;

import cn.javawebs.dao.UserDao;
import cn.javawebs.dao.impl.UserDaoImpl;
import cn.javawebs.domain.User;
import cn.javawebs.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao dao=new UserDaoImpl();

    @Override
    public List<User> findAll() {
        //调用Dao完成查询
        return dao.findAll();
    }
}
