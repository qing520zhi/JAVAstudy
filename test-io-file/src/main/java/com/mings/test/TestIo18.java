package com.mings.test;

import java.io.*;
import java.util.Arrays;

/**
 * @Author: MINGS
 * @Date: 2025/04/11 20:35
 * @Param:
 * @Return:
 * @Description:
 **/
public class TestIo18 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("D:\\a.txt"));
        String line = br.readLine();
        String[] s = line.split(" ");
        int[] arr = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //输出流必须写在下面
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\a.txt"));
        for (int i = 0; i < arr.length; i++) {
            bw.write(arr[i] + " ");
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
