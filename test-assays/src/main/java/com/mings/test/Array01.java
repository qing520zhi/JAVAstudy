package com.mings.test;


import java.util.Arrays;

/**
 * @projectName: AdvancedDeom
 * @package: com.mings.test
 * @className: Array01
 * @author: mings
 * @description: TODO
 * @date: 2025/3/8 19:44
 * @version: 1.0
 */
public class Array01 {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        //打印数组
        System.out.println(Arrays.toString(arr));

        int i = Arrays.binarySearch(arr, 5);
        System.out.println(i);
    }
}
