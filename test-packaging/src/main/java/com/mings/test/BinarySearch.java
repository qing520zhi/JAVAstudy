package com.mings.test;

/**
 * @projectName: AdvancedDeom
 * @package: com.mings.test
 * @className: BinarySearch
 * @author: mings
 * @description: TODO
 * @date: 2025/3/6 20:49
 * @version: 1.0
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int num = 11;

        int index = binarySearchForIndex(arr, num);
        System.out.println(index);
    }

    private static int binarySearchForIndex(int[] arr, int num) {
        int min=0;
        int max=arr.length-1;
        while (min<=max){
            int mid = (min+max)>>1;
            if (arr[mid]==num){
                return mid;
            }else if (arr[mid]>num){
                max=mid-1;
            }else {
                min=mid+1;
            }
        }
        return -1;
    }
}
