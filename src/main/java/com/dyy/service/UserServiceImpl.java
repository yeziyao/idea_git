package com.dyy.service;

import com.dyy.dao.UserDAO;
import com.dyy.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    UserDAO userDAO;

    @Transactional(readOnly = true)
    public User queryUserById(Integer id) {
        System.out.println("111");
        User user = userDAO.selectById(id);
        System.out.println(user);
        return user;
    }

    public void sayHi(String name) {
        System.out.println("hello"+name);
    }

    public void modifyUser(User user) {
        System.out.println("service");
        userDAO.updateUser(user);
        System.out.println("impl");
    }
}
