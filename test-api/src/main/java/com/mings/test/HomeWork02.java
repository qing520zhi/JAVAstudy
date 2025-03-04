package com.mings.test;


/**
 * @projectName: AdvancedDeom
 * @package: com.mings.test
 * @className: HomeWork02
 * @author: mings
 * @description: TODO
 * @date: 2025/3/4 21:28
 * @version: 1.0
 */
public class HomeWork02 {
    public static void main(String[] args) {
        int[] arr = {2,3,-7,-9,0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<0){
                arr[i]=Math.abs(arr[i]);
            }
            System.out.println(arr[i]);
        }
    }
}
