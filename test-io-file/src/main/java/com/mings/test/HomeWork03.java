package com.mings.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: MINGS
 * @Date: 2025/04/10 19:40
 * @Param:
 * @Return:
 * @Description:
 **/
public class HomeWork03 {
    public static void main(String[] args) throws IOException {

        //Work01();
        //Work02();
        //Work03();
        //Work04();
        Work05();
        //Work06();
    }

    private static void Work06() throws IOException {
        FileInputStream fis = new FileInputStream("E:\\a.png");
        FileOutputStream fos = new FileOutputStream("D:\\a.png");
        int b;
        while ((b = fis.read()) != -1) {
            fos.write(b);
        }
        fis.close();
        fos.close();
    }

    private static void Work05() throws IOException {
        FileInputStream fis = new FileInputStream("D:\\b.txt");
        byte[] b = new byte[1024];
        int len;
        while ((len = fis.read(b)) != -1) {
            System.out.println(new String(b,0,len));
        }
        fis.close();
    }

    private static void Work04() throws IOException {
        FileInputStream fis = new FileInputStream("D:\\a.txt");
        int b;
        while ((b=fis.read())!=-1){
            System.out.print((char)b);
        }
        fis.close();
    }
    private static void Work03() throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\c.txt", true);
        for (int i = 0; i < 5; i++){
            //先换行
            fos.write("\r\n".getBytes());
            fos.write("i love java".getBytes());
        }
        fos.close();
    }

    private static void Work02() throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\b.txt");
        fos.write("i love java".getBytes());
        fos.close();
    }
    private static void Work01() throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\a.txt");
        fos.write(97);
        fos.close();
    }
}
