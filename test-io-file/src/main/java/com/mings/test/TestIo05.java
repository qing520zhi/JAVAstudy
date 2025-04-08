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
public class TestIo05 {
    public static void main(String[] args) throws IOException {

        //1、创建一个字符输出流对象
        FileOutputStream fos = new FileOutputStream("D:\\a.txt", true);
        //2、调用write方法，把数据写入到文件中
        try {
            fos.write(97);
            //getBytes()：把字符串变成字节数组
            fos.write("\r\n".getBytes());
            fos.write(98);
            fos.write("\r\n".getBytes());
            fos.write(99);
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            //3、释放资源
            //判断：fos是否为空
            if (fos != null){
                try {
                    fos.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
