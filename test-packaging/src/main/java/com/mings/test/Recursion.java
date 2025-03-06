package com.mings.test;


/**
 * @projectName: AdvancedDeom
 * @package: com.mings.test
 * @className: Recursion
 * @author: mings
 * @description: TODO
 * @date: 2025/3/6 21:14
 * @version: 1.0
 */
public class Recursion {
    public static void main(String[] args) {
        int recursion1 = recursion1(99);
        int recursion2 = recursion2(5);
        System.out.println(recursion1);
        System.out.println(recursion2);
    }

    private static int recursion1(int i) {
        if (i == 1) {
            return 1;
        } else {
            return i + recursion1(i - 1);
        }
    }

    private static int recursion2(int i) {
        if (i == 1) {
            return 1;
        } else {
            return i * recursion2(i - 1);
        }
    }
}
