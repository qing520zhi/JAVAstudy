package com.mings.test;

import java.io.File;
import java.io.IOException;

/**
 * @Author: MINGS
 * @Date: 2025/03/27 20:11
 * @Param:
 * @Return:
 * @Description: file
 **/
public class TestFile04 {

    public static void main(String[] args) throws IOException {

        //method01();

        File file = new File("E:\\a.txt");
        boolean exists = file.exists();
        System.out.println(exists);
        String name = file.getName();
        System.out.println(name);
    }

    private static void method01() {
        File file = new File("E:\\a.txt");

        boolean file1 = file.isFile();
        System.out.println(file1);
        boolean file2 = file.isDirectory();
        System.out.println(file2);
    }
}
