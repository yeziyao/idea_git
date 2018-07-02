package com.dyy.entity;

import org.springframework.stereotype.Component;
import java.io.Serializable;


@Component
public class User implements Serializable{
    private Integer id;
    private String name;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public User() {
    }

    public User(Integer id, String name) {

        this.id = id;
        this.name = name;
    }

    public User(Integer id) {

        this.id = id;
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
