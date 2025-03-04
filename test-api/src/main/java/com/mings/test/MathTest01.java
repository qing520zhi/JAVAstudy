package com.mings.test;


import  java.lang.Math.*;


/**
 * @projectName: AdvancedDeom
 * @package: com.mings.test
 * @className: MathTest01
 * @author: mings
 * @description: TODO
 * @date: 2025/3/3 20:19
 * @version: 1.0
 */
public class MathTest01 {
    public static void main(String[] args) {

        // 取绝对值
        int abs = Math.abs(-10);
        System.out.println(abs);

        // 向上取整
        double ceil = Math.ceil(10.1);
        System.out.println(ceil);

        // 向下取整
        double floor = Math.floor(10.9);
        System.out.println(floor);

        // 四舍五入
        double round = Math.round(10.5);
        double round1 = Math.round(10.4);
        System.out.println(round);
        System.out.println(round1);

        // 随机数
        double random = Math.random();
        System.out.println(random);

        // 幂运算
        double pow = Math.pow(2, 3);
        System.out.println(pow);

        // 获取最大值
        int max = Math.max(10, 20);
        System.out.println(max);

        // 获取最小值
        int min = Math.min(10, 20);
        System.out.println(min);

        // 获取平方根
        double sqrt = Math.sqrt(25);
        System.out.println(sqrt);

        // 获取自然对数
        double log = Math.log(10);
        System.out.println(log);

        // 获取对数
        double log10 = Math.log10(10);
        System.out.println(log10);

        // 获取e的次方
        double exp = Math.exp(10);
        System.out.println(exp);

        // 获取2的次方
        double pow2 = Math.pow(2, 10);
        System.out.println(pow2);
    }
}
