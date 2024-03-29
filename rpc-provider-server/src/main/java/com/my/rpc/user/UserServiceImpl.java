package com.my.rpc.user;

import com.my.rpc.anno.APIInfo;
import com.my.rpc.entity.User;
import com.my.rpc.service.UserService;

/**
 * @Description 需要暴露的注解
 * @Date 2019/7/3 12:52
 * @Created by rogan.luo
 */
@APIInfo(value = UserService.class, version = "v1")
public class UserServiceImpl implements UserService {
    public String save(User user) {
        return "[v1] Hi " + user.getName();
    }

    public String getById(Integer id) {
        return "[v1] Success";
    }
}
