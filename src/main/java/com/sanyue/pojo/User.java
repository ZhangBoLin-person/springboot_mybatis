package com.sanyue.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author BoLin
 * @create 2020-10-21 23:02
 */
@Data
@NoArgsConstructor
@ApiModel("用户实体类")
public class User {

    @ApiModelProperty("用户ID")
    private Integer id;
    @ApiModelProperty("用户名")
    private String username;
    @ApiModelProperty("用户密码")
    private String password;
    @ApiModelProperty("用户电话")
    private String phone;

    public User(String username, String password, String phone) {
        this.username = username;
        this.password = password;
        this.phone = phone;
    }

    public User(Integer id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
}
