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
public class TestIo09 {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("D:\\a.txt");
        FileOutputStream fos = new FileOutputStream("test-io-file\\a.txt");
        //1、创建一个字节数组
        byte [] b = new byte[1024];
        int len;
        //2、循环读取，写到新文件
        while ((len = fis.read(b)) != -1){
            //3、每次读取len个字节，写入到新文件
            fos.write(b,0,len);
        }
        //4、释放资源
        fos.close();
        fis.close();
    }
}
