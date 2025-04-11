package com.mings.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Author: MINGS
 * @Date: 2025/04/11 20:17
 * @Param:
 * @Return:
 * @Description:
 **/
public class TestIo16 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("D:\\a.txt"));

        char[] ch = new char[1024];
        int len;
        while ((len = br.read(ch)) != -1) {
            System.out.println(new String(ch,0,len));
        }
        br.close();
    }
}
