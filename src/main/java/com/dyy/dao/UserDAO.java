package com.dyy.dao;

import com.dyy.entity.User;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

public interface UserDAO {

    @Select("select * from t_user where id=#{id}")
    public User selectById(Integer id);

    @Update("update t_user set name=#{name} where id=#{id}")
    public void updateUser(User user);
}
