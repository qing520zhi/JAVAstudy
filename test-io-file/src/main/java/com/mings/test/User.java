package com.mings.test;

import java.io.Serializable;

/**
 * @Author: MINGS
 * @Date: 2025/04/13 19:53
 * @Param:
 * @Return:
 * @Description:
 **/
public class User implements Serializable {
    private String name;
    private Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
