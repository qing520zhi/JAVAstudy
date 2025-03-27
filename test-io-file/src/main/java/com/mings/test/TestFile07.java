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
public class TestFile07 {

    public static void main(String[] args) throws IOException {

        File file = new File("E:\\test\\test\\test");

        deleteFile(file);
    }

    private static void deleteFile(File file) {
        //四步解决文件夹与递归结合的问题
        //1、进入
        File[] files = file.listFiles();
        //2、遍历
        for (File file1 : files) {
            //3、判断
            if (file1.isFile()){
                file1.delete();
            } else {
                //4、判断
                deleteFile(file1);
            }
            file.delete();
        }
    }
}
