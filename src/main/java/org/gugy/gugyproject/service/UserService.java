package org.gugy.gugyproject.service;

import org.gugy.gugyproject.entity.User;
import org.gugy.gugyproject.entity.query.UserQuery;
import org.gugy.gugyproject.entity.receive.UserReceive;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 辜光宇
 * 2021/1/12 15:23
 */
public interface UserService {

    /**
     * 获取用户列表
     * @param query 查询参数
     * @return 用户列表
     */
    List<User> getUserList(UserQuery query);

    /**
     * 新增用户
     * @param receive
     * @return
     */
    Long addUser(UserReceive receive);
}
