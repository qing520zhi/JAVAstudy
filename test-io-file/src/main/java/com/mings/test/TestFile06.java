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
public class TestFile06 {

    public static void main(String[] args) throws IOException {

        File file = new File("test-io-file\\a.txt");
        boolean newFile = file.createNewFile();
        System.out.println(newFile);
    }
}
