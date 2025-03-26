package com.mings.test;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @Author: MINGS
 * @Date: 2025/03/25 20:47
 * @Param:
 * @Return:
 * @Description: stream流中间方法的使用
 * @Version: 1.0
 **/
public class TestStream03 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        list.add("张三");
        list2.add("张三");
        list.add("张无忌");
        list2.add("张无忌");
        list.add("张三丰");
        list2.add("张三丰");
        list.add("张二麻子");
        list.add("谢广坤");
        list2.add("王五");
        list.add("张良");
        list.add("张良");
        list.add("张良");
        list.add("张良");

        // limit(n)：截断流，使其元素不超过n个
        //list.stream().limit(3).forEach(System.out::println);

        // skip(n)：跳过元素，返回一个扔掉了前n个元素的流，若流中元素不足n个，则返回一个空流，与limit(n)互补
        //list.stream().skip(3).forEach(System.out::println);

        // concat(s1,s2)：合并两个流
        //Stream.concat(list.stream(), list2.stream()).forEach(System.out::println);

        // distinct()：去重
        list.stream().distinct().forEach(System.out::println);

    }
}
