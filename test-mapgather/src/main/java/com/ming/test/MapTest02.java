package com.ming.test;


import java.util.HashMap;
import java.util.Map;

/**
 * @projectName: AdvancedDeom
 * @package: com.ming.test
 * @className: Test01
 * @author: mings
 * @description: TODO
 * @date: 2025/3/17 10:03
 * @version: 1.0
 */
public class MapTest02 {
    public static void main(String[] args) {

        // 创建一个Map集合
        Map<String,String> map = new HashMap<>();
        // 向Map集合中添加元素
        map.put("姓名1","张三");
        map.put("姓名2","李四");
        map.put("姓名3","王五");

        System.out.println(map);
        //remove(map);
        //clear(map);
        //comtains(map);

        boolean empty = map.isEmpty();
        System.out.println(empty);
    }

    private static void comtains(Map<String, String> map) {
        //查找指定key是否存在
        boolean result = map.containsKey("姓名3");
        System.out.println(result);
        // 查找指定value是否存在
        boolean result1 = map.containsValue("赵六");
        System.out.println(result1);
    }

    private static void remove(Map<String, String> map) {
        //根据key删除集合元素，返回被删除的value值
        String result = map.remove("姓名1");
        System.out.println(result);
        System.out.println(map);
    }

    private static void clear(Map<String, String> map) {
        // 删除集合中的所有元素
        map.clear();
        System.out.println(map);
    }
}
