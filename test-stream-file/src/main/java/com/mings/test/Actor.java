package com.mings.test;

/**
 * @Author: MINGS
 * @Date: 2025/03/26 20:41
 * @Param:
 * @Return:
 * @Description: Actor实体类
 **/
public class Actor {
    private String name;

    public Actor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                '}';
    }
}
