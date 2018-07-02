package com.dyy.service;

import com.dyy.entity.User;

public interface UserService {

    public User queryUserById(Integer id);

    public void modifyUser(User user);

    public void sayHi(String name);
}
