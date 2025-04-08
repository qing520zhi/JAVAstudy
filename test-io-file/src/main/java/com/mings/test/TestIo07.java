package com.mings.test;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Author: MINGS
 * @Date: 2025/04/08 19:37
 * @Param:
 * @Return:
 * @Description:
 **/
public class TestIo07 {
    public static void main(String[] args) throws IOException {

        //1、创建一个字符输入流对象
        FileInputStream fos = new FileInputStream("D:\\a.txt");
        //2、调用read方法，把数据读到内存中
        for (int i = fos.read(); i != -1; i = fos.read()){
            System.out.print((char)i);
        }
        //3、释放资源
        fos.close();
    }
}
