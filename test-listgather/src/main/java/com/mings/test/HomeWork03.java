package com.mings.test;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @projectName: AdvancedDeom
 * @package: com.mings.test
 * @className: HomeWork01
 * @author: mings
 * @description: 某公司产品经理要求App需要有3款主题样式，用户选择不同的主题，展示时间的格式也要有不同的风格，请编写代码实现该功能。
 * @date: 2025/3/13 20:03
 * @version: 1.0
 */
public class HomeWork03 {
    public static void main(String[] args) throws ParseException {

        Date date = new Date();
        Scanner sc =new Scanner(System.in);

        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy年MM月dd日");
        SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdf3=new SimpleDateFormat("yyyy/MM/dd");
        while (true){
            System.out.println("请选择主题:1.xxxx年xx月xx日，2.xxxx-xx-xx，3.xxxx/xx/xx，4.退出");
            String next = sc.next();
            switch (next){
                case "1":
                    System.out.println(sdf1.format(date));
                    break;
                case "2":
                    System.out.println(sdf2.format(date));
                    break;
                case "3":
                    System.out.println(sdf3.format(date));
                    break;
                case "4":
                    System.out.println("退出");
                    System.exit(0);
                    break;
                default:
                    System.out.println("输入有误，请重新输入");
            }
        }
    }
}
