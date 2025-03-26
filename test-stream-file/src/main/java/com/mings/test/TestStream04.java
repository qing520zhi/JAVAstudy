package com.mings.test;

import java.util.ArrayList;

/**
 * @Author: MINGS
 * @Date: 2025/03/25 20:47
 * @Param:
 * @Return:
 * @Description: stream流终结方法的使用
 * @Version: 1.0
 **/
public class TestStream04 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("张无忌");
        list.add("张三丰");
        list.add("张二麻子");
        list.add("谢广坤");
        list.add("张良");

        //对集合进行遍历
        //list.forEach(System.out::println);

        //count()：返回流中元素的个数
        /*long count = list.stream().count();
        System.out.println(count);*/
    }
}
