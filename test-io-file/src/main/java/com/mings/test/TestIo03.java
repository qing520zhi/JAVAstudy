package com.mings.test;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: MINGS
 * @Date: 2025/04/08 19:37
 * @Param:
 * @Return:
 * @Description:
 **/
public class TestIo03 {
    public static void main(String[] args) throws IOException {

        //1、创建一个字符输出流对象
             //如果文件不存在，会自动创建
             //如果文件存在，会清空文件
        FileOutputStream fos = new FileOutputStream("D:\\a.txt");
        //2、调用write方法，把数据写入到文件中
        fos.write(97);
        //Windows 换行符是\r\n，Linux是\n，MAC是\r
        //getBytes()：把字符串变成字节数组
        fos.write("\r\n".getBytes());
        fos.write(98);
        fos.write("\r\n".getBytes());
        fos.write(99);
        //fos.write(bytes);

        //3、释放资源
        fos.close();
    }
}
