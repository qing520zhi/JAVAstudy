package com.mings.test;

import java.io.*;

/**
 * @Author: MINGS
 * @Date: 2025/04/13 19:08
 * @Param:
 * @Return:
 * @Description:
 **/


public class TestIo19 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //method01();
        //method02();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\a.txt"));
        User user = (User) ois.readObject();
        System.out.println(user);
        ois.close();
    }

    private static void method02() throws IOException {
        User user = new User("mings", 18);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\a.txt"));
        oos.writeObject(user);
        oos.close();
    }

    private static void method01() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\a.txt"), "UTF-8");

        int len;
        while ((len = isr.read()) != -1) {
            System.out.print((char) len);
        }
        isr.close();
    }
}
