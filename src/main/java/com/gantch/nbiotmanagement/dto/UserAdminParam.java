package com.gantch.nbiotmanagement.dto;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * @author lcw332
 * Date 2019-12-18-11:33
 * Description:  nbiot-devies-management , com.gantch.nbiotdevicesmanagement.dto
 **/
@Data
public class UserAdminParam {
    @ApiModelProperty(value="用户名",required = true)
    @NotEmpty(message = "用户名不能为空")
    private String username;

    @ApiModelProperty(value = "密码", required = true)
    @NotEmpty(message = "密码不能为空")
    private String password;

    @ApiModelProperty(value = "用户昵称")
    private String nickName;

    @ApiModelProperty(value = "备注")
    private String note;
}
