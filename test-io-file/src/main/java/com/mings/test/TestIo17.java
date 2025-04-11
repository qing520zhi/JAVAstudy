package com.mings.test;

import java.io.*;

/**
 * @Author: MINGS
 * @Date: 2025/04/11 20:22
 * @Param:
 * @Return:
 * @Description:
 **/
public class TestIo17 {
    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\a.txt"));
        BufferedReader br = new BufferedReader(new FileReader("D:\\a.txt"));

        bw.write("hello");
        bw.write("\r\n");
        bw.write("world", 0, 3);
        bw.write("\r\n");
        char[] chars = {'a', 'b', 'c'};
        bw.write(chars, 0, 2);
        bw.write("\r\n");
        bw.write("你好");
        bw.newLine();
        bw.write("java");
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
