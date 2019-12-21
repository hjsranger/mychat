package com.hjs.mychat.controller;


import com.hjs.mychat.entity.Users;
import com.hjs.mychat.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author hjsranger
 * @since 2019-12-21
 */
@RestController
@RequestMapping("/api/users")
public class UsersController {

    @Autowired
    private IUsersService iUsersService;

    @GetMapping("/test")
    public String test(){

        Users users = new Users();
        users.setId("jianshuang_huang");
        users.setPassword("1");
        users.setFaceImageBig("1");
        users.setFaceImage("face");
        users.setNickname("HJS");
        users.setQrcode("1231");
        users.setCid("1");
        users.setUsername("jianHJS");

        iUsersService.save(users);
        return "SUCCESS";

    }

    @GetMapping("/test2")
    public String test2(){

        List<Users> usersList = iUsersService.list();
        for (Users users : usersList) {
            System.out.println(users.getId());
        }

        return "SUCCESS";
    }

}

