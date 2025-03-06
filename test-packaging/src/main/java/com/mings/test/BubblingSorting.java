package com.mings.test;


/**
 * @projectName: AdvancedDeom
 * @package: com.mings.test
 * @className: BubblingSorting
 * @author: mings
 * @description: TODO
 * @date: 2025/3/6 21:01
 * @version: 1.0
 */
public class BubblingSorting {
    public static void main(String[] args) {
        int[] arr = {9,3,4,6,8,1,2,7};
        bubblingSorting(arr);
        for (int j : arr) {
            System.out.println(j);
        }
    }

    // 冒泡排序
    private static void bubblingSorting(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            // 内循环
            for (int j = 0; j < arr.length-1-i; j++){
                if (arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
