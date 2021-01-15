package org.gugy.gugyproject.service.Impl;

import com.github.pagehelper.PageHelper;
import org.gugy.gugyproject.entity.User;
import org.gugy.gugyproject.entity.query.UserQuery;
import org.gugy.gugyproject.mapper.UserMapper;
import org.gugy.gugyproject.service.UserService;
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

    @Override
    public List<User> getUserList(UserQuery query) {
        PageHelper.startPage(query.getPage(), query.getPageSize());
        return userMapper.selectAll();
    }

    @Override
    public Long addUser(User user) {
//        return userMapper.insert(user);
        return null;
    }
}
