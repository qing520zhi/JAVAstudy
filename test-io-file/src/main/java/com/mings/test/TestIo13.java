package com.mings.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author: MINGS
 * @Date: 2025/04/10 20:14
 * @Param:
 * @Return:
 * @Description:
 **/
public class TestIo13 {
    public static void main(String[] args) throws IOException {

        // 创建一个FileWriter对象，指定文件名
        // 如果文件不存在，则创建该文件,如果存在，则清空文件
        // 父文件夹必须存在
        FileWriter fw = new FileWriter("D:\\a.txt");
        char[] chars = {'a', 'b', 'c'};
        try {
            //写一个字符
            fw.write(97);
            //写一个字符数组
            fw.write(chars, 0, 2);
            //写一个字符串
            fw.write("hello");
            //写一个字符串的一部分
            fw.write("world",0,3);
            fw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            fw.close();
        }
    }
}
