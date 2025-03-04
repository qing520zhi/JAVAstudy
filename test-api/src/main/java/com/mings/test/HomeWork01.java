package com.mings.test;


/**
 * @projectName: AdvancedDeom
 * @package: com.mings.test
 * @className: HomeWork01
 * @author: mings
 * @description: TODO
 * @date: 2025/3/4 21:10
 * @version: 1.0
 */
public class HomeWork01 {
    public static void main(String[] args) {

        //随机生成100以内的小数
        double r1 = Math.random()*100;
        System.out.println(r1);
        //将小数转成字符串
        String s1 = String.valueOf(r1);
        System.out.println(s1);
        //在字符串中查找小数点的索引
        int index = s1.indexOf(".");
        //截取小数点前面的3位
        String s2 = s1.substring(0, index + 3);
        System.out.println(s2);
    }
}
