package com.mings.test;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @projectName: AdvancedDeom
 * @package: com.mings.test
 * @className: date02
 * @author: mings
 * @description: TODO
 * @date: 2025/3/11 20:46
 * @version: 1.0
 */
public class date02 {
    public static void main(String[] args) throws ParseException {
        //2020年11月11日 0:03:47
        //2020年11月11日 0:11:11

        //2020年11月11日 0:00:00
        //2020年11月11日 0:10:00

        String s1 = "2020年11月11日 00:03:47";
        String s2 = "2020年11月11日 00:11:11";
        String s3 = "2020年11月11日 00:00:00";
        String s4 = "2020年11月11日 00:10:00";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月DD日 HH:mm:ss");
        Date date1 = sdf.parse(s1);
        Date date2 = sdf.parse(s2);
        Date date3 = sdf.parse(s3);
        Date date4 = sdf.parse(s4);
        long time1 = date1.getTime();
        long time2 = date2.getTime();
        long time3 = date3.getTime();
        long time4 = date4.getTime();
        if (time1>=time3&&time1<=time4){
            System.out.println("小贾同学成功参与活动");
        }else {
            System.out.println("小贾同学参与活动失败");
        }
        if (time2>=time3&&time2<=time4){
            System.out.println("小伊同学成功参与活动");
        }else {
            System.out.println("小伊同学参与活动失败");
        }
    }
}
