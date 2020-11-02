package com.bgs.aoyoback.dto;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;


import java.io.Serializable;

@Data
public class UpdatePsdDto implements Serializable {

    @NotBlank(message = "旧密码不能为空。")
    private String oldPassword;

    @NotBlank(message = "新密码不能为空。")
    private String newPassword;

}
