package com.mings.test;


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @projectName: AdvancedDeom
 * @package: com.mings.test
 * @className: HomeWork01
 * @author: mings
 * @description: [练习一]  请用代码实现:获取当前的日期,并把这个日期转换为指定格式的字符串,如2088-08-08 08:08:08。
 * @date: 2025/3/13 20:03
 * @version: 1.0
 */
public class HomeWork01 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = sdf.format(date);
        System.out.println(format);
    }
}
