package com.mings.test;


import java.util.Iterator;
import java.util.LinkedList;

/**
 * @projectName: AdvancedDeom
 * @package: com.mings.test
 * @className: LinkedList01
 * @author: mings
 * @description: TODO
 * @date: 2025/3/13 19:56
 * @version: 1.0
 */
public class LinkedList02 {
    public static void main(String[] args) {
        LinkedList<String> s =new LinkedList<>();
        s.add("a");
        s.add("b");
        s.add("c");

        addFirst(s);

        addLast(s);

        getFirst(s);

        getLast(s.getLast());
    }

    private static void getLast(String s) {
        // 获取最后一个元素
        String last = s;
        System.out.println(last);
    }

    private static void getFirst(LinkedList<String> s) {
        // 获取第一个元素
        getLast(s.getFirst());
    }

    private static void addLast(LinkedList<String> s) {
        // 在尾部添加元素
        s.addLast("e");
        System.out.println(s);
    }

    private static void addFirst(LinkedList<String> s) {
        // 在头部添加元素
        s.addFirst("d");
        System.out.println(s);
    }
}
