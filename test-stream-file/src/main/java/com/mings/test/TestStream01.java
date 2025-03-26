package com.mings.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Stream;

/**
 * @Author: MINGS
 * @Date: 2025/03/25 20:47
 * @Param:
 * @Return:
 * @Description:
 **/
public class TestStream01 {
    public static void main(String[] args) {

        /*
        * 单列集合：集合对象.Stream流
        * 双列集合：不能直接获取流，需要先获取到集合对象，再获取流
                   集合对象.keySet().stream()
                   集合对象.entrySet().stream()
        *  数组   ：
                    Arrays.stream(数组对象)
        * 同数据类型的多个数据：Stream.of(数据1，数据2，数据3)
        * */

        //list();
        //map();

        //array();

        num();
    }

    private static void num() {
        Stream.of(1,2,3,5,4,7,6,2,3).filter(s -> s % 2 == 0).forEach(System.out::println);
    }

    /**
     * @Author: MINGS
     * @Date: 2025/03/25 20:57
     * @Param:
     * @Return:
     * @Description:
    **/
    private static void array() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //数组流,静态方法获取流
        Arrays.stream(arr).filter(s -> s % 2 == 0).forEach(System.out::println);
    }

    private static void map() {
        //双列集合
        HashMap<String, String> map = new HashMap<>();
        map.put("name", "张三");
        map.put("age", "18");
        map.put("sex", "男");
        map.put("address", "北京");

        //双列集合不能直接获取stream流
        //map.keySet().stream().filter(s -> s.startsWith("a")).forEach(System.out::println);
        map.entrySet().stream().filter(s -> s.getKey().startsWith("a")).forEach(System.out::println);
    }

    private static void list() {

        ArrayList<String> list = new ArrayList<>();

        list.add("张三");
        list.add("张五");
        list.add("张大山");
        list.add("李四");
        list.add("王五");
        list.add("赵六");

        list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 2).forEach(System.out::println);
    }
}
