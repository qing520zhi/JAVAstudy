package com.mings.test;


import java.util.HashSet;

/**
 * @projectName: AdvancedDeom
 * @package: com.mings.test
 * @className: HashSet01
 * @author: mings
 * @description: TODO
 * @date: 2025/3/16 21:10
 * @version: 1.0
 */
public class HashSet02 {
    public static void main(String[] args) {

        // HashSet
        HashSet<Student> students = new HashSet<>();
        students.add(new Student("zangsan", 18));
        students.add(new Student("lisi", 17));
        students.add(new Student("lisi", 17));
        students.add(new Student("wangwu", 20));
        students.add(new Student("wangwu", 20));

        for (Student student : students) {
            System.out.println(student.hashCode());
            System.out.println(student);
        }
    }
}
