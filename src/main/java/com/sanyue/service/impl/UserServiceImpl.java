package com.sanyue.service.impl;

import com.sanyue.mapper.UserMapper;
import com.sanyue.pojo.User;
import com.sanyue.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author BoLin
 * @create 2020-10-22 9:09
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> queryUserList() {
        return userMapper.queryUserList();
    }

    @Override
    public User queryUserById(Integer id) {
        return userMapper.queryUserById(id);
    }

    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public int deleteUser(Integer id) {
        return userMapper.deleteUser(id);
    }
}
