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
 * @author ������
 * 2021/1/12 15:25
 * �û��ӿ�
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;


    /**
     * ��ȡ�û��б�
     *
     * @param query ��ѯ����
     * @return �û��б�
     */
    @GetMapping("/getList")
    public List<User> getUserList(UserQuery query) {
        System.out.println("11111");
        return userService.getUserList(query);
    }

    /**
     * �����û�
     *
     * @param receive ������
     * @return �����û�id
     */
    @PostMapping("/add")
    public Long addUser(UserReceive receive) {
        return userService.addUser(receive);
    }
}
