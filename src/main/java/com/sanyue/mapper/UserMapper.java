package com.sanyue.mapper;

import com.sanyue.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author BoLin
 * @create 2020-10-21 23:04
 */
@Mapper
@Repository
public interface UserMapper {

    List<User> queryUserList();

    User queryUserById(Integer id);

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(Integer id);

}
