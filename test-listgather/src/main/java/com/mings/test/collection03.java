package com.mings.test;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @projectName: AdvancedDeom
 * @package: com.mings.test
 * @className: collection01
 * @author: mings
 * @description: TODO
 * @date: 2025/3/11 20:58
 * @version: 1.0
 */
public class collection03 {
    public static void main(String[] args) {
        // 创建集合
        Collection<String> list = new ArrayList<>();
        // 添加元素
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("b");
        list.add("c");
        list.add("c");
        list.add("b");
        list.add("a");

        //迭代器遍历集合
        /*while (list1.hasNext()) {
            String next = list1.next();
            System.out.println(next);
        }*/
        //for循环遍历集合
        for (String next : list) {
            System.out.println(next);
        }
        // removeIf()方法删除集合元素
        list.removeIf("b"::equals);
        System.out.println(list);

        // 迭代器删除集合元素
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            if ("c".equals(it.next())){
                it.remove();
            }
        }
        System.out.println(list);
    }
}
