package com.sanyue.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * @author BoLin
 * @create 2020-10-22 10:00
 */
@ApiModel("结果返回对象")
public class ResultDto implements Serializable {
    @ApiModelProperty("结果返回状态码")
    private Integer code;
    @ApiModelProperty("结果返回信息")
    private String message;
    @ApiModelProperty("结果返回日期")
    private Date date;

    public ResultDto(Integer code, String message, Date date) {
        this.code = code;
        this.message = message;
        this.date = date;
    }

    public ResultDto() {
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
