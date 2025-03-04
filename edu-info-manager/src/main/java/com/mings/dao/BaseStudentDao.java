package com.mings.dao;

import com.mings.domain.Student;

/**
 * @author MINGS-PC
 */
public interface BaseStudentDao {

    // 添加学生
    public abstract Boolean addStudent(Student stu);

    // 查询所有学生
    public abstract Student[] findAllStudent();

    // 删除学生
    public abstract   void deleteStudentById(String stuId);

    // 获取下标
    public abstract int getIndex(String stuId);

    // 更新学生
    public abstract   void updateStudent(String stuId, Student stu);
}
