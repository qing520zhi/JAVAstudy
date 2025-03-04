package com.mings.test;


/**
 * @projectName: AdvancedDeom
 * @package: com.mings.test
 * @className: Tset03
 * @author: mings
 * @description: TODO
 * @date: 2025/3/2 20:46
 * @version: 1.0
 */
public class Tset03 {
    public static void main(String[] args) {

        // 匿名内部类
        goSwimming(new Swimming() {
            @Override
            public void swing() {
                System.out.println("游泳1");
            }
        });
        // lambda表达式
        goSwimming(()-> System.out.println("游泳2"));
    }
    public  static void goSwimming(Swimming swimming){
        swimming.swing();
    }
}
interface Swimming{
    void swing();
}

