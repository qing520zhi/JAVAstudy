package com.mings.test;


import java.text.ParseException;
import java.util.ArrayList;

/**
 * @projectName: AdvancedDeom
 * @package: com.mings.test
 * @className: HomeWork01
 * @author: mings
 * @description: 定义一个方法listTest(ArrayList<String> al, String s),要求使用contains()方法判断al集合里面是否包含s。
 * @date: 2025/3/13 20:03
 * @version: 1.0
 */
public class HomeWork05 {
    public static void main(String[] args) throws ParseException {

        ArrayList<String> al = new ArrayList<>();
        al.add("张三");
        al.add("李四");
        al.add("王五");
        al.add("赵六");
        boolean test = listTest(al, "张三");
        System.out.println(test);
    }
    public static boolean listTest(ArrayList<String> al, String s){
        // contains()方法判断al集合里面是否包含s
        return al.contains(s);
    }
}
