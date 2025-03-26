package com.mings.test;


import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @Author: MINGS
 * @Date: 2025/03/25 20:47
 * @Param:
 * @Return:
 * @Description: stream流收集方法
 * @Version: 1.0
 **/
public class TestStream05 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <=10; i++) {
            list.add(i);
        }
        //list.stream().filter(x -> x % 2 == 0).forEach(System.out::println);

        Set<Integer> collect = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toSet());
        collect.forEach(System.out::println);
    }
}
