package com.sanyue.service;

import com.sanyue.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author BoLin
 * @create 2020-10-22 9:07
 */
public interface UserService {

    List<User> queryUserList();

    User queryUserById(Integer id);

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(Integer id);

}
