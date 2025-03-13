package com.mings.test;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * @projectName: AdvancedDeom
 * @package: com.mings.test
 * @className: HomeWork01
 * @author: mings
 * @description: 定义一个集合，并把集合(集合里面的元素是Integer)转成存有相同元素的数组，并将结果输出在控制台。
 * @date: 2025/3/13 20:03
 * @version: 1.0
 */
public class HomeWork04 {
    public static void main(String[] args) throws ParseException {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        // 将集合转成数组
        Object[] objects = list.toArray();
        for (Object object : objects) {
            System.out.println(object);
        }
    }
}
