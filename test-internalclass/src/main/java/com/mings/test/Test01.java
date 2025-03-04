package com.mings.test;


/**
 * @projectName: AdvancedDeom
 * @package: com.mings.test
 * @className: Test01
 * @author: mings
 * @description: TODO
 * @date: 2025/3/2 20:18
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        method01();
    }
    // 内部类
    public static void method01(){
        //局部内部类
        class test{
            public void test(){
                System.out.println("test");
            }
        }
        test t = new test();
        t.test();
    }
}
