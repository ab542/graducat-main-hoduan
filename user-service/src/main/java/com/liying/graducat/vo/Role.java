package com.liying.graducat.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: liying
 * @Date: 2024/1/28 14:11
 * @Description:
 */
@Data
@ApiModel("角色信息表实体")
@AllArgsConstructor
@NoArgsConstructor
public class Role {
    @ApiModelProperty("主键字段")
    private Long id;
    @ApiModelProperty("用户id-外键")
    private Long userId;
    @ApiModelProperty("角色类型字段")
    private String roleName;
    @ApiModelProperty("等级字段")
    private int authorityLevel;


}
