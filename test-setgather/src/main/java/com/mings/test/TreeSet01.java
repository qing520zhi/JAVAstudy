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
public class TreeSet01 {
    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(4);
        treeSet.add(3);

        System.out.println(treeSet);

    }
}
