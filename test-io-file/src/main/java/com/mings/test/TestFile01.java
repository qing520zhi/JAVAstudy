package com.mings.test;

import java.io.File;

/**
 * @Author: MINGS
 * @Date: 2025/03/27 20:11
 * @Param:
 * @Return:
 * @Description: file
 **/
public class TestFile01 {

    public static void main(String[] args) {

        //method01();

        method02();
    }

    /**
     * @Author: MINGS
     * @Date: 2025/03/27 20:22
     * @Param:
     * @Return:
     * @Description: 路径拼接
    **/
    private static void method02() {
        String path1 = "E:\\a.txt";
        String path2 = "E:\\test";
        File file = new File(path2,path1);
        System.out.println(file);
    }

    /**
     * @Author: MINGS
     * @Date: 2025/03/27 20:20
     * @Param:
     * @Return:
     * @Description: 将现有的路径封装成File对象
    **/
    private static void method01() {
        String path = "E:\\a.txt";
        File file = new File(path);
        System.out.println(file);
    }
}
