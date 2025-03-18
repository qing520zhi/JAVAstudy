package com.ming.test;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @projectName: AdvancedDeom
 * @package: com.ming.test
 * @className: Test01
 * @author: mings
 * @description: hashmap集合的遍历
 * @date: 2025/3/17 10:03
 * @version: 1.0
 */
public class MapTest03 {
    public static void main(String[] args) {

        // 创建一个Map集合
        Map<String, String> map = new HashMap<>();
        // 向Map集合中添加元素
        map.put("姓名1", "张三");
        map.put("姓名2", "李四");
        map.put("姓名3", "王五");

        //获取集合中所有的键，遍历集合
        Set<String> keySet = map.keySet();
        for (String s : keySet) {
            String value = map.get(s);
            System.out.println(s + ":" + value);
        }
        System.out.println("---------------------------------------------");

        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> stringStringEntry : entrySet) {
            System.out.println(stringStringEntry.getKey() + ":" + stringStringEntry.getValue());
        }
    }
}
