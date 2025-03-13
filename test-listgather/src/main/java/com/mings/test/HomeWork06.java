package com.mings.test;


import java.text.ParseException;
import java.util.ArrayList;

/**
 * @projectName: AdvancedDeom
 * @package: com.mings.test
 * @className: HomeWork01
 * @author: mings
 * @description: 定义一个方法listTest(ArrayList<Integer> al, Integer s)，要求返回s在al里面第一次出现的索引，如果s没出现过返回-1
 * @date: 2025/3/13 20:03
 * @version: 1.0
 */
public class HomeWork06 {
    public static void main(String[] args) throws ParseException {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(2);

        int test = listTest(al, 2);
        System.out.println(test);
    }
    public static int listTest(ArrayList<Integer> al, Integer s){
        // indexOf()方法返回s在al里面第一次出现的索引，如果s没出现过返回-1
        return al.indexOf(s);
    }
}
