package com.mings.test;

import java.io.File;
import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @Author: MINGS
 * @Date: 2025/04/06 20:24
 * @Param:
 * @Return:
 * @Description: Stream流合并
 **/
public class HomeWork02 {
    public static void main(String[] args) {

        File file = new File("D:\\a.txt");
        if (file.exists()){
            System.out.println("文件存在");
        }else {
            try {
                file.createNewFile();
                System.out.println("文件不存在，创建成功");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
