package com.mings.test01;

/**
 * 子类示例，继承自父类 Fu
 * @author MINGS-PC
 */
public class Zi extends Fu {

    /**
     * 重写父类方法，调用父类 test() 方法
     * 通过 super 关键字显式调用父类实现
     */
    public void method() {
        super.test(); // 调用父类的 test() 方法
    }
}
