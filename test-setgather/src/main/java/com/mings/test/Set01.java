package com.mings.test;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @projectName: AdvancedDeom
 * @package: com.mings.test
 * @className: Set01
 * @author: mings
 * @description: TODO
 * @date: 2025/3/13 20:53
 * @version: 1.0
 */
public class Set01 {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        System.out.println(set);

        //迭代器
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //增强for
        for (String s : set) {
            System.out.println(s);
        }

    }
}
