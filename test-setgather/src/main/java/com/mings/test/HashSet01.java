package com.mings.test;


import java.util.HashSet;

/**
 * @projectName: AdvancedDeom
 * @package: com.mings.test
 * @className: HashSet01
 * @author: mings
 * @description: TODO
 * @date: 2025/3/16 21:10
 * @version: 1.0
 */
public class HashSet01 {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        set.add("hello");
        set.add("world");
        set.add("java");

        int hashCode = set.hashCode();
        System.out.println(hashCode);

        for (String s : set) {
            System.out.println(s);
        }
    }
}
