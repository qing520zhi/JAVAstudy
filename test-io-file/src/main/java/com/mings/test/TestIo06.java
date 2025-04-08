package com.mings.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: MINGS
 * @Date: 2025/04/08 19:37
 * @Param:
 * @Return:
 * @Description:
 **/
public class TestIo06 {
    public static void main(String[] args) throws IOException {

        //1、创建一个字符输入流对象
        FileInputStream fos = new FileInputStream("D:\\a.txt");
        //2、调用read方法，把数据读到内存中
        //一次读取一个字节，读取的是字符的ASCII码值
        int read = fos.read();
        System.out.println(read);
        //3、释放资源
        fos.close();
    }
}
