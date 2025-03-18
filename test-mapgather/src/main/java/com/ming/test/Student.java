package com.ming.test;


/**
 * @projectName: AdvancedDeom
 * @package: com.ming.test
 * @className: Student
 * @author: mings
 * @description: TODO
 * @date: 2025/3/18 20:08
 * @version: 1.0
 */
public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
