package com.yinxf.consumer.controller;

import com.yinxf.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author yinxf
 * @Date 2021/5/22 14:30
 * @Description
 **/
@RestController
@RequestMapping("user")
@Slf4j
public class UserController {

    @DubboReference
    private UserService userService;

    @GetMapping
    public String get(){
        log.info("查询用户名成功");
        return userService.getUserName("yinxf");
    }

    @DeleteMapping
    public String delete(){
        log.info("删除用户成功");
        return userService.deleteUser("yinxf");
    }

}
