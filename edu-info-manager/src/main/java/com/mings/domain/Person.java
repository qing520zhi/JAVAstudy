package com.mings.domain;

/**
 * @author MINGS-PC
 */
public class Person {
    private  String id;
    private  String name;
    private  int age;
    private  String birthday;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
        if (age>=0 && age<=150){
            this.age = age;
        }else {
            System.out.println("年龄输入有误，请重新输入");
        }

    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Person() {
    }

    public Person(String id, String name, int age, String birthday) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }
}
