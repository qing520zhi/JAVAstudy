package com.mings.test;

import java.util.*;

/**
 * @projectName: AdvancedDeom
 * @package: com.mings.test
 * @className: List01
 * @author: mings
 * @description: TODO
 * @date: 2025/3/12 20:20
 * @version: 1.0
 */
public class List01 {
    public static void main(String[] args) {
        List<String> s=new ArrayList<>();
        s.add("a");
        s.add("b");
        s.add("c");
        s.add("d");

        for (String string : s) {
            System.out.println(string);
        }
        // 添加元素,原有元素后移一位
        s.add(1,"f");
        System.out.println(s);

        // 删除元素,返回被删除的元素
        String remove = s.remove(1);
        System.out.println(remove);
        System.out.println(s);

        // 修改元素,返回被修改的元素
        String g = s.set(1, "g");
        System.out.println(g);
        System.out.println(s);

        String s1 = s.get(1);
        System.out.println(s1);
    }
}
