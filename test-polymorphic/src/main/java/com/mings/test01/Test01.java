package com.mings.test01;


/**
 * @projectName: AdvancedDeom
 * @package: com.mings.test
 * @className: Test01
 * @author: mings
 * @description: TODO
 * @date: 2025/2/27 20:55
 * @version: 1.0
 */
public class Test01{
    public static void main(String[] args) {

            /*
             * 请编写程序, 打印出接口中的变量num, 随后调用method方法
             * 要求程序与最终运行结果吻合
             */
        System.out.println(Inter.num);
        InterImpl interImpl = new InterImpl();
        interImpl.method();

    }
}
