package com.baizhi.votesys.service.impl;

import com.baizhi.votesys.dao.UserDao;
import com.baizhi.votesys.entity.User;
import com.baizhi.votesys.service.UserService;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @project: vote-ssm
 * @author: AdminLi
 * @date: 2019/2/22
 */

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserByUsernameAndPwd(String username, String password) {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("username", username).eq("password", password);
        return userDao.selectOne(wrapper);
    }

    @Override
    public void addUser(User user) {
        userDao.insert(user);
    }
}
