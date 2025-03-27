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
public class TestFile05 {

    public static void main(String[] args) throws IOException {

        File file = new File("D:\\");

        /* 获取文件列表,隐藏文件和隐藏文件夹都可以获取
        调用者为文件时，会返回null
        调用者为空目录时，会返回空数组
        调用者为非空目录时，会返回该目录下的所有文件和文件夹
        调用者为有权限才能进去的目录时，返回null*/
        File[] files = file.listFiles();
        for (File f : files) {
            System.out.println(f);
        }
    }
}
