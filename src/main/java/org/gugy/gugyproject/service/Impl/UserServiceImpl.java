package org.gugy.gugyproject.service.Impl;

import com.github.pagehelper.PageHelper;
import org.gugy.gugyproject.annotation.Log;
import org.gugy.gugyproject.entity.User;
import org.gugy.gugyproject.entity.query.UserQuery;
import org.gugy.gugyproject.entity.receive.UserReceive;
import org.gugy.gugyproject.mapper.UserMapper;
import org.gugy.gugyproject.service.UserService;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author πºπ‚”Ó
 * 2021/1/12 15:24
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;


    @Resource
    private RedisTemplate<String, List<User>> redisTemplate;

    @Override
//    @Log(operationName = "≤‚ ‘√˚≥∆",operationType = "≤‚ ‘¿‡–Õ")
    public List<User> getUserList(UserQuery query) {
        System.out.println("222222");
        String key = "userList";
        ValueOperations<String, List<User>> operations = redisTemplate.opsForValue();
        Boolean hasKey = redisTemplate.hasKey(key);
        if (hasKey) {
            return operations.get(key);
        }
        PageHelper.startPage(query.getPage(), query.getPageSize());
        List<User> users = userMapper.selectAll();

        operations.set("userList", users);
        return users;

    }

    @Override
    public Long addUser(UserReceive receive) {
        User user = new User();

        userMapper.insert(user);
        return user.getId();
    }
}
