package com.mings.test;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * @Author: MINGS
 * @Date: 2025/04/11 20:06
 * @Param:
 * @Return:
 * @Description:
 **/
public class TestIo14 {
    public static void main(String[] args) throws FileNotFoundException {

        FileReader fr = new FileReader("D:\\a.txt");
        //method01(fr);

        char[] ch = new char[1024];
        try {
            int len = fr.read(ch);
            System.out.println(new String(ch,0,len));
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                fr.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * @Author: MINGS
     * @Date: 2025/04/11 20:11
     * @Param:
     * @Return:
     * @Description: 一次读取一个字符
     * @Method: method01
    **/
    private static void method01(FileReader fr) {
        try {
            int i = 0;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                fr.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
