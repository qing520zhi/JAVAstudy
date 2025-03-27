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
public class TestFile03 {

    public static void main(String[] args) throws IOException {

        methode();
    }

    /**
     * @Author: MINGS
     * @Date: 2025/03/27 20:37
     * @Param:
     * @Return:
     * @Description: 删除文件，永久删除，只能删除文件和空文件夹
    **/
    private static void methode() {
        File file = new File("E:\\b.txt");
        boolean delete = file.delete();
        System.out.println(delete);
    }
}
