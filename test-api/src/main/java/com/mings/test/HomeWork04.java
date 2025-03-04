package com.mings.test;


/**
 * @projectName: AdvancedDeom
 * @package: com.mings.test
 * @className: HomeWork04
 * @author: mings
 * @description: TODO
 * @date: 2025/3/4 21:43
 * @version: 1.0
 */
public class HomeWork04 {
    public static void main(String[] args) {
        //堆对象vs常量池对象
        String s1 = new String("abc");
        String s2 = "abc";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println("--------------");

        //常量池复用
        String s3 = "abc";
        String s4 = "abc";
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
        System.out.println("--------------");

        //优化后等价于字面量赋值
        String s5 = "a" + "b" + "c";
        String s6 = "abc";
        System.out.println(s5 == s6);
        System.out.println(s5.equals(s6));
        System.out.println("--------------");

        //堆中新建对象，内容相同但地址不同
        String s7 = "ab";
        String s8 = "abc";
        String s9 = s7 + "c";
        System.out.println(s9 == s8);
        System.out.println(s9.equals(s8));
        System.out.println("--------------");
    }
}
