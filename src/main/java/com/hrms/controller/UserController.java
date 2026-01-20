package com.hrms.controller;


import com.hrms.service.serviceImpl.UserService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;
    @PostMapping("/register")
    public int UserRegister(String userAccount,String Password){
        userService.userRegister(userAccount,Password,null);
        return 1;
    }
    @GetMapping("/test")
    public String test() {
        return "test success";
    }
}
