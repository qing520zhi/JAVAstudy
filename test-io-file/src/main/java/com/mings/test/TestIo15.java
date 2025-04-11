package com.mings.test;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @Author: MINGS
 * @Date: 2025/04/11 20:12
 * @Param:
 * @Return:
 * @Description:
 **/
public class TestIo15 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入账号：");
        String No = sc.next();
        System.out.println("请输入密码：");
        String pwd = sc.next();

        FileWriter fw = new FileWriter("D:\\a.txt");
        fw.write(No);
        fw.write("\r\n");
        fw.write(pwd);
        fw.flush();
        fw.close();
    }
}
