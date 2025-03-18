package com.mings.test;


import java.util.Objects;

/**
 * @projectName: AdvancedDeom
 * @package: com.mings.test
 * @className: Student
 * @author: mings
 * @description: TODO
 * @date: 2025/3/15 19:50
 * @version: 1.0
 */
public class Student implements Comparable<Student>{
    String name;
    int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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

    /**
     * @param o the object to be compared.
     * @return
     */
    /*@Override
    public int compareTo(Student o) {
        // 按照年龄升序
        return this.age-o.age;
    }*/
    // 如果年龄相同，按照姓名升序
    @Override
    public int compareTo(Student o) {
        // 按照年龄升序
        int result = this.age - o.age;
        // 如果年龄相同，按照姓名升序
        result = result == 0 ? this.name.compareTo(o.name) : result;
        return result;
    }

    /*@Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
       *//* //父类的hashCode方法
        return super.hashCode();*//*
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }*/

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
