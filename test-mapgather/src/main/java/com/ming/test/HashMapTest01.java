package com.ming.test;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @projectName: AdvancedDeom
 * @package: com.ming.test
 * @className: HashMapTest01
 * @author: mings
 * @description: HshMap基础应用
 * @date: 2025/3/18 20:08
 * @version: 1.0
 */
public class HashMapTest01 {
    public static void main(String[] args) {

        HashMap<String,Student> map = new HashMap<>();

        Student student1 = new Student("xiaoming", 18);
        Student student2 = new Student("wangwu", 16);
        Student student3= new Student("xiaoli", 19);
        Student student4 = new Student("zzhangsan", 18);

        map.put("student1",student1);
        map.put("student2",student2);
        map.put("student3",student3);
        map.put("student4",student4);

        //forEach遍历
        map.forEach(
                (k, v) -> System.out.println(k + ":" + v)
        );
        System.out.println("-------------");
        //keySet方法遍历
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println(key + ":" + map.get(key));
        }
        System.out.println("---------------");
        //entrySet方法遍历
        Set<Map.Entry<String, Student>> entries = map.entrySet();
        for (Map.Entry<String, Student> entry : entries) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
