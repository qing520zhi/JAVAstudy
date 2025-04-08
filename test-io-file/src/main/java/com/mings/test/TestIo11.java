package com.mings.test;

import java.io.*;

/**
 * @Author: MINGS
 * @Date: 2025/04/09 19:37
 * @Param:
 * @Return:
 * @Description:
 **/
public class TestIo11 {
    public static void main(String[] args) throws IOException {

        //字节缓冲输出流，从文件中读取
        //在底层创建一个默认长度为8192的byte[]数组
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:a.txt"));

        //字节缓冲输入流，写到文件中去
        //在底层创建一个默认长度为8192的byte[]数组
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:b.txt"));

        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1){
            bos.write(bytes,0,len);
        }
        //释放资源\
        bis.close();
        bos.close();
    }
}
