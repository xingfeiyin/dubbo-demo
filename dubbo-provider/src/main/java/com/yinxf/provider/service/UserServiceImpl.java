package com.yinxf.provider.service;

import com.yinxf.service.UserService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @Author yinxf
 * @Date 2021/5/22 14:22
 * @Description
 **/
@DubboService
public class UserServiceImpl implements UserService {

    @Override
    public String getUserName(String userName) {
        return "username is " + userName;
    }

    @Override
    public String deleteUser(String user) {
        return user + "delete is success";
    }
}
