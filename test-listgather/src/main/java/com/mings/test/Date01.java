package com.mings.test;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @projectName: AdvancedDeom
 * @package: com.mings.test
 * @className: Date01
 * @author: mings
 * @description: TODO
 * @date: 2025/3/11 20:26
 * @version: 1.0
 */
public class Date01 {
    public static void main(String[] args) throws ParseException {
        //空参构造方法，代表当前电脑时间
        Date date = new Date();
        System.out.println(date);

        //从计算机时间原点开始，经过指定的毫秒数，代表的时间
        Date date1 = new Date(0L);
        // 格式化时间
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date2 = sdf.format(date);
        System.out.println(date2);
        System.out.println(date1);

        String s="2023-03-11 20:26:01";
        Date date3 = sdf.parse(s);
        System.out.println(date3);
    }
}
