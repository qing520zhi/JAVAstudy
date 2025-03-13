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
public class LinkedList01 {

    // 链表
    public static void main(String[] args) {
        LinkedList<String> s =new LinkedList<>();
        s.add("a");
        s.add("b");
        s.add("c");

        for (String string : s) {
            System.out.println(string);
        }
        Iterator<String> iterator = s.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (int i = 0; i < s.size(); i++) {
            System.out.println(s.get(i));
        }
    }
}
