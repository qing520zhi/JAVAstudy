package com.mings.test;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @Author: MINGS
 * @Date: 2025/03/26 20:42
 * @Param:
 * @Return:
 * @Description:  Stream流练习
 **/
public class TestStream06 {
    public static void main(String[] args) {

        ArrayList<String> manlist = new ArrayList<>();
        manlist.add("张国立");
        manlist.add("王宝强");
        manlist.add("吴京");
        manlist.add("蔡徐坤");
        manlist.add("大鹏");
        manlist.add("艾伦");

        ArrayList<String> womanlist = new ArrayList<>();
        womanlist.add("杨紫");
        womanlist.add("柳岩");
        womanlist.add("白百合");
        womanlist.add("李小璐");
        womanlist.add("杨幂");
        womanlist.add("关晓彤");

        Stream<String> stream1 = manlist.stream().filter(s -> s.length() == 3).limit(2);
        Stream<String> stream2 = womanlist.stream().filter(s -> s.startsWith("杨")).skip(1);

        Stream.concat(stream1, stream2).forEach(s -> {
            Actor actor = new Actor(s);
            System.out.println(actor);
        });
    }
}
