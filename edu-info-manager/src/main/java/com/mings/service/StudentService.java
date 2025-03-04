package com.mings.service;

import com.mings.dao.BaseStudentDao;
import com.mings.dao.OtherStudentDao;
import com.mings.domain.Student;
import com.mings.factory.StudentDaoFactory;

/**
 * @author MINGS-PC
 */
public class StudentService {
    private static BaseStudentDao studentDao = StudentDaoFactory.getStudentDao();

    public  boolean isExists(String stuId) {
        //调用dao层方法，判断是否存在老师
        Student[] stus = studentDao.findAllStudent();
        boolean exists = false;
        for (Student stu : stus) {
            if (stu != null && stu.getId().equals(stuId)) {
                exists = true;
                break;
            }
        }
        return exists;
    }

    public  Boolean addStudent(Student stu) {
        return studentDao.addStudent(stu);
    }

    public  Student[] findAllStudent() {
        Student[] stus = studentDao.findAllStudent();
        boolean flag = false;
        for (int i = 0; i < stus.length; i++) {
            Student stu = stus[i];
            if (stu != null) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            return null;
        } else {
            return stus;
        }
    }

    public  void deleteStudentById(String stuId) {
        studentDao.deleteStudentById(stuId);

    }

    public  void updateStudent(String stuId, Student stu) {
        studentDao.updateStudent(stuId, stu);
    }
}
