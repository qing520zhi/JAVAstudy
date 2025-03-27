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
public class TestFile02 {

    public static void main(String[] args) throws IOException {

        //method01();

        //method02();

        //method03();
    }

    /**
     * @Author: MINGS
     * @Date: 2025/03/27 20:34
     * @Param:
     * @Return:
     * @Description: 创建文件夹，可以创建多级文件夹
    **/
    private static void method03() {
        File file = new File("E:\\test\\test\\test\\test");
        boolean result = file.mkdirs();
        System.out.println(result);
    }

    /**
     * @Author: MINGS
     * @Date: 2025/03/27 20:31
     * @Param:
     * @Return:
     * @Description: 创建文件夹，只能创建一级文件夹
    **/
    private static void method02() {
        File file = new File("E:\\test\\test");
        boolean result = file.mkdir();
        System.out.println(result);
    }

    /**
     * @Author: MINGS
     * @Date: 2025/03/27 20:31
     * @Param:
     * @Return:
     * @Description: 创建文件,只能创建一级文件
    **/
    private static void method01() throws IOException {
        File file = new File("E:\\b.txt");
        boolean result = file.createNewFile();
        System.out.println(result);
    }
}
