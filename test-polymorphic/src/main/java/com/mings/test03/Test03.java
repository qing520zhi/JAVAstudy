package com.mings.test03;


/**
 * @projectName: AdvancedDeom
 * @package: com.mings.test03
 * @className: Test03
 * @author: mings
 * @description: TODO
 * @date: 2025/2/27 21:13
 * @version: 1.0
 */
public class Test03 {
    public static void main(String[] args) {
        Fu fu = new Zi();
        System.out.println(fu.num);
        fu.method();
        Zi zi =(Zi) fu;
        zi.show();
    }
}
