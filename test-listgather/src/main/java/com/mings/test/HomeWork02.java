package com.mings.test;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @projectName: AdvancedDeom
 * @package: com.mings.test
 * @className: HomeWork01
 * @author: mings
 * @description: [练习二] 使用SimpleDateFormat类,把2018-03-04转换为2018年03月04日。
 * @date: 2025/3/13 20:03
 * @version: 1.0
 */
public class HomeWork02 {
    public static void main(String[] args) throws ParseException {

        String s = "2018-03-04";
        System.out.println(s);
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
        // 先将将字符串转换为日期
        Date format = sdf.parse(s);
        SimpleDateFormat sdf1 =new SimpleDateFormat("yyyy年MM月dd日");
        // 再将日期格式化
        String date1 = sdf1.format(format);
        System.out.println(date1);
    }
}
