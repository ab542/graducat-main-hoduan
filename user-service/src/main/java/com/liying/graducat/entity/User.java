package com.liying.graducat.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: liying
 * @Date: 2024/1/27 22:48
 * @Description: 用户信息展示实体
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("用户信息展示实体")
public class User {
    @ApiModelProperty("用户id")
    private Long id;
    @ApiModelProperty("用户昵称")
    private String nickName;
    @ApiModelProperty("电话号码")
    private String phoneNumber;
    @ApiModelProperty("邮件地址")
    private String email;
    @ApiModelProperty("角色类型")
    private String roleType;

}
