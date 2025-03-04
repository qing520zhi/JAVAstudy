package com.mings.test;


/**
 * @projectName: AdvancedDeom
 * @package: com.mings.test
 * @className: Test02
 * @author: mings
 * @description: TODO
 * @date: 2025/3/2 20:27
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        //4、 创建接口对象
        InnerImpl inner = new InnerImpl();
        //5、 调用接口方法
        inner.method();

        new Inter(){
            @Override
            public void method() {
                System.out.println("匿名内部类");
            }
        }.method();
        Inter2 inter2 = new Inter2() {
            @Override
            public void method1() {
                System.out.println("匿名内部类1");
            }

            @Override
            public void method2() {
                System.out.println("匿名内部类2");
            }
        };
        inter2.method1();
        inter2.method2();
    }
}
//1、定义接口
interface Inter {
    void method();
}
interface Inter2 {
    void method1();
    void method2();
}
//2、实现接口
class InnerImpl implements Inter {
    //3、重写接口方法
    @Override
    public void method() {
        System.out.println("Inner");
    }
}
