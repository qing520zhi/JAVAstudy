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
public class TestIo08 {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("D:\\a.txt");
        FileOutputStream fos = new FileOutputStream("test-io-file\\a.txt");
        int b;
        while ((b = fis.read()) != -1){
            fos.write(b);
        }
        fis.close();
        fos.close();
    }
}
