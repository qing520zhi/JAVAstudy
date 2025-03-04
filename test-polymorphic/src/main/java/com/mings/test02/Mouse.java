package com.mings.test02;


/**
 * @projectName: AdvancedDeom
 * @package: com.mings.test02
 * @className: Mouse
 * @author: mings
 * @description: TODO
 * @date: 2025/2/27 21:09
 * @version: 1.0
 */
public class Mouse implements Usb{
    @Override
    public void start() {
        System.out.println("连接鼠标的USB");
    }

    @Override
    public void stop() {
        System.out.println("断开鼠标的USB");
    }
}
