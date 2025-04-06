package com.mings.test;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/**
 * @Author: MINGS
 * @Date: 2025/03/27 20:11
 * @Param:
 * @Return:
 * @Description: file
 **/
public class TestFile08 {

    public static void main(String[] args) throws IOException {

        File file = new File("test-io-file");
        HashMap<String, Integer> hm = new HashMap<>();
        getCount(hm, file);
        System.out.println(hm);
    }

    private static void getCount(HashMap<String, Integer> hm, File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isFile()){
                String fName = f.getName();
                String[] fNameArr = fName.split("\\.");
                if (fNameArr.length == 2){
                    String key = fNameArr[1];
                    if (hm.containsKey(key)){
                        Integer count = hm.get(key);
                        count++;
                        hm.put(key, count);
                    }else {
                        hm.put(key, 1);
                    }
                }
            }else {
                getCount(hm, f);
            }
        }
    }

}
