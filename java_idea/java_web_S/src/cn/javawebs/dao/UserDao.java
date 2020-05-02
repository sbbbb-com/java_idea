package cn.javawebs.dao;

import cn.javawebs.domain.User;

import java.util.List;

/**
 * 用户操作的dao
 */
public interface UserDao {

    public List<User> findAll();
}
