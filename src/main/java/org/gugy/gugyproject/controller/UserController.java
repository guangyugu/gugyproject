package org.gugy.gugyproject.controller;

import org.gugy.gugyproject.entity.User;
import org.gugy.gugyproject.entity.query.UserQuery;
import org.gugy.gugyproject.entity.receive.UserReceive;
import org.gugy.gugyproject.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 辜光宇
 * 2021/1/12 15:25
 * 用户接口
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;


    /**
     * 获取用户列表
     *
     * @param query 查询参数
     * @return 用户列表
     */
    @GetMapping("/getList")
    public List<User> getUserList(UserQuery query) {
        System.out.println("11111");
        return userService.getUserList(query);
    }

    /**
     * 新增用户
     *
     * @param receive 接收类
     * @return 新增用户id
     */
    @PostMapping("/add")
    public Long addUser(UserReceive receive) {
        return userService.addUser(receive);
    }
}
