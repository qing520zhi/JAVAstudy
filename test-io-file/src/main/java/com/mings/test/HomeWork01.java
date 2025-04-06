package com.mings.test;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @Author: MINGS
 * @Date: 2025/04/06 20:24
 * @Param:
 * @Return:
 * @Description: Stream流合并
 **/
public class HomeWork01 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("郭靖");
        list.add("杨康");

        ArrayList list2 = new ArrayList();
        list2.add("黄蓉");
        list2.add("穆念慈");

        Stream l = Stream.concat(list.stream(), list2.stream());
        l.forEach(System.out::println);
    }
}
