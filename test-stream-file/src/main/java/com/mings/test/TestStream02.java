package com.mings.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @Author: MINGS
 * @Date: 2025/03/25 20:47
 * @Param:
 * @Return:
 * @Description: stream流lambda表达式
 **/
public class TestStream02 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("张无忌");
        list.add("张三丰");
        list.add("张二麻子");
        list.add("谢广坤");
        list.add("张良");

        /*//stream获取流对象
        //filter过滤器
        list.stream().filter(
                new Predicate<String>() {
                    @Override
                    public boolean test(String s) {
                        boolean result = s.startsWith("张");
                        return result;
                    }
                }
        );*/

        list.stream().filter(s -> s.startsWith("张")).forEach(System.out::println);
    }
}
