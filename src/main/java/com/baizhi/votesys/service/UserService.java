package com.baizhi.votesys.service;

import com.baizhi.votesys.entity.User;

/**
 * @project: vote-ssm
 * @author: AdminLi
 * @date: 2019/2/22
 */
public interface UserService {

    User getUserByUsernameAndPwd(String username, String password);

    void addUser(User user);

}
