package com.hrms.service.serviceImpl;

import com.hrms.model.User;
import com.baomidou.mybatisplus.extension.service.IService;

public interface UserService extends IService<User>{
    /*
     * @param userAccount   用户账户
     * @param userPassword  用户密码
     * @param checkPassword 校验密码
    */
    long userRegister(String userAccount, String userPassword, String checkPassword);
}
