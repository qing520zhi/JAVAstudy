package com.mings.test;


/**
 * @projectName: AdvancedDeom
 * @package: com.mings.test
 * @className: test01
 * @author: mings
 * @description: TODO
 * @date: 2025/3/8 20:14
 * @version: 1.0
 */
public class test01 {
    public static void main(String[] args) {
        try {
            int[] arr={45,78,28,152,35,82,463};
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            String string = e.toString();
            System.out.println(string);
        }
    }


}
