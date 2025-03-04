package com.mings.test02;


/**
 * @projectName: AdvancedDeom
 * @package: com.mings.test02
 * @className: Test02
 * @author: mings
 * @description: TODO
 * @date: 2025/2/27 21:11
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.turnon();
        Mouse mouse = new Mouse();
        mouse.start();
        mouse.stop();
        computer.turnoff();
    }
}
