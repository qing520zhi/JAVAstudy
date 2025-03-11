package com.mings.test;


import java.util.ArrayList;
import java.util.Arrays;

/**
 * @projectName: AdvancedDeom
 * @package: com.mings.test
 * @className: collection01
 * @author: mings
 * @description: TODO
 * @date: 2025/3/11 20:58
 * @version: 1.0
 */
public class collection01 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        String[] arr1 = {"a","b","c"};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));

        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println(list);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        System.out.println(list1);
    }
}
