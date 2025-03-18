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
public class MapTest01 {
    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();
        map.put("name","zhangsan");
        map.put("age","18");
        map.put("sex","man");

        map.forEach(
                (k,v)-> System.out.println(k+":"+v)
        );
    }
}
