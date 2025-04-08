package com.mings.test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @Author: MINGS
 * @Date: 2025/04/09 20:58
 * @Param:
 * @Return:
 * @Description:
 **/
public class TestIo12 {
    public static void main(String[] args) throws UnsupportedEncodingException {

       // method01();
        byte[] bytes = {-28, -67, -96, -26, -104, -81, -25, -100, -97, -25, -102, -124, -25, -117, -105};
        byte[] bytes1 = {-60, -29, -54, -57, -43, -26, -75, -60, -71, -73};

        //使用idea默认编码格式UTF-8，将字节数组转换为字符串
        String s = new String(bytes);
        System.out.println(s);

        //指定使用GBK编码格式，将字节数组转换为字符串
        String s1 = new String(bytes1, "GBK");
        System.out.println(s1);
    }

    /**
     * @Author: MINGS
     * @Date: 2025/04/09 21:04
     * @Param:
     * @Return:
     * @Description:
    **/
    private static void method01() throws UnsupportedEncodingException {
        String str = "你是真的狗";
        //使用idea默认编码格式UTF-8，将字符串转换为字节数组
        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));

        //指定使用GBK编码格式，将字符串转换为字节数组
        byte[] bytes1 = str.getBytes("GBK");
        System.out.println(Arrays.toString(bytes1));
    }
}
