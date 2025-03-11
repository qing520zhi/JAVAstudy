package com.mings.test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * @projectName: AdvancedDeom
 * @package: com.mings.test
 * @className: collection01
 * @author: mings
 * @description: TODO
 * @date: 2025/3/11 20:58
 * @version: 1.0
 */
public class collection02 {
    public static void main(String[] args) {
        // 创建集合
        Collection<String> collection = new ArrayList<>();
        // 添加元素
        collection.add("a");
        collection.add("b");
        collection.add("c");
        collection.add("a");
        System.out.println(collection);
        // 删除集合中的元素，返回值表示是否删除成功
        boolean removed = collection.remove("a");
        System.out.println(removed);
        // 根据条件删除元素，通过lambda表达式删除集合中的元素, 返回值表示是否删除成功
        boolean removedIf = collection.removeIf((String s) -> {
            return s.equals("b");
        });
        System.out.println(removedIf);
        // 清空集合
        //collection.clear();
        // 判断集合中是否包含某个元素，返回值表示是否包含
        boolean containsed = collection.contains("d");
        System.out.println(containsed);
        boolean empty = collection.isEmpty();
        // 判断集合是否为空，返回值表示是否为空
        System.out.println(empty);
        // 获取集合的大小，返回值表示集合的大小
        int size = collection.size();
        System.out.println(size);
    }
}
