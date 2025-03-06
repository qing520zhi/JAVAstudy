package com.mings.test;


/**
 * @projectName: AdvancedDeom
 * @package: com.mings.test
 * @className: Test01
 * @author: mings
 * @description: TODO
 * @date: 2025/3/6 20:37
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        String s ="95 64 25 87 63";
        String[] split = s.split(" ");
        int[] arr = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            arr[i] = Integer.parseInt(split[i]);
            System.out.println(arr[i]);
        }
    }
}
