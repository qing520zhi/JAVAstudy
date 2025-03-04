package com.mings.dao;

import com.mings.domain.Student;

import java.util.ArrayList;

/**
 * @author MINGS-PC
 */
public class OtherStudentDao implements BaseStudentDao {
    private static ArrayList<Student> stus = new ArrayList<>();

    static {
        // 集合初始化数据时不能用set方法，应该用add方法，否则会导致索引越界
        stus.add(0, new Student("10001", "小明", 20, "2000-01-01"));
        stus.add(1, new Student("10002", "小红", 21, "1999-01-01"));
        stus.add(2, new Student("10003", "小刚", 22, "1998-01-01"));
    }
    @Override
    public Boolean addStudent(Student stu) {
        int index = -1;
        for (int i = 0; i < stus.size(); i++) {
            Student student = stus.get(i);
            if (student ==null){
                index =i;
                break;
            }
        }
        if (index == -1) {
            return false;
        }else {
            stus.set(index, stu);
        }
        return true;
    }

    @Override
    public Student[] findAllStudent() {
        Student[] stus1 = new Student[stus.size()];
        for (int i = 0; i < stus1.length; i++) {
            stus1[i] = stus.get(i);
        }
        return stus1;
    }

    @Override
    public  void deleteStudentById(String stuId) {
        int index = getIndex(stuId);
        stus.remove(index);
    }

    @Override
    public int getIndex(String stuId){
        int index = -1;
        for (int i = 0; i < stus.size(); i++) {
            if (stus.get(i) != null && stus.get(i).getId().equals(stuId)) {
                index = i;
                break;
            }
        }
        return index;
    }

    @Override
    public  void updateStudent(String stuId, Student stu) {
        int index = getIndex(stuId);
        stus.set(index, stu);
    }
}
