package com.mings.test;


import java.util.TreeSet;

/**
 * @projectName: AdvancedDeom
 * @package: com.mings.test
 * @className: TreeSe02
 * @author: mings
 * @description: TODO
 * @date: 2025/3/15 19:52
 * @version: 1.0
 */
public class TreeSe02 {
    public static void main(String[] args) {

        //学生集合
        TreeSet<Student> stu =new TreeSet<>();
        stu.add(new Student("张三", 18));
        stu.add(new Student("李四", 17));
        stu.add(new Student("王五", 20));
        stu.add(new Student("赵六", 20));

        for (Student student : stu) {
            System.out.println(student);
        }
    }
}
