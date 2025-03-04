package com.mings.dao;

import com.mings.domain.Student;

/**
 * @author MINGS-PC
 */
public class StudentDao implements BaseStudentDao {
    private static Student[] stus = new Student[5];

    static {
        stus[0] = new Student("10001", "小明", 20, "2000-01-01");
        stus[1] = new Student("10002", "小红", 21, "1999-01-01");
        stus[2] = new Student("10003", "小刚", 22, "1998-01-01");
    }
    @Override
    public Boolean addStudent(Student stu) {
        int index = -1;
        for (int i = 0; i < stus.length; i++) {
            Student student = stus[i];
            if (student ==null){
                index =i;
                break;
            }
        }
        if (index == -1) {
            return false;
        }else {
            stus[index] = stu;
        }
        return true;
    }

    @Override
    public Student[] findAllStudent() {
        return stus;
    }

    @Override
    public  void deleteStudentById(String stuId) {
        int index = getIndex(stuId);
        stus[index] = null;
    }

    @Override
    public int getIndex(String stuId){
        int index = -1;
        for (int i = 0; i < stus.length; i++) {
            if (stus[i] != null && stus[i].getId().equals(stuId)) {
                index = i;
                break;
            }
        }
        return index;
    }

    @Override
    public  void updateStudent(String stuId, Student stu) {
        int index = getIndex(stuId);
        stus[index] = stu;
    }
}
