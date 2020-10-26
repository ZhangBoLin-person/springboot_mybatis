package com.sanyue.controller;

import com.sanyue.dto.ResultDto;
import com.sanyue.pojo.User;
import com.sanyue.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * @author BoLin
 * @create 2020-10-22 9:12
 */
@ApiOperation("用户控制类")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/queryUserList")
    public List<User> queryUserList() {
        return userService.queryUserList();
    }

    @GetMapping("/queryUserById/{id}")
    public User queryUserById(@PathVariable Integer id) {
        return userService.queryUserById(id);
    }

    @GetMapping("/addUser/{username}/{password}/{phone}")
    public ResultDto addUser(@PathVariable String username, @PathVariable String password, @PathVariable String phone) {
        User user = new User(username, password, phone);
        System.out.println(user.toString());
        int i = userService.addUser(user);
        if (i != 0) {
            return new ResultDto(200, "插入成功", new Date());
        } else {
            return new ResultDto(500, "插入失败", new Date());
        }
    }

    @GetMapping("/updateUser/{id}/{username}/{password}")
    public ResultDto updateUser(@PathVariable Integer id, @PathVariable String username, @PathVariable String password) {
        User user = new User(id, username, password);
        System.out.println(user.toString());
        int i = userService.updateUser(user);
        if (i != 0) {
            return new ResultDto(200, "修改成功", new Date());
        } else {
            return new ResultDto(500, "修改失败", new Date());
        }
    }

    @GetMapping("/deleteUser/{id}")
    public ResultDto deleteUser(@PathVariable Integer id) {
        int i = userService.deleteUser(id);
        if (i != 0) {
            return new ResultDto(200, "删除成功", new Date());
        } else {
            return new ResultDto(500, "删除失败", new Date());
        }
    }
}
