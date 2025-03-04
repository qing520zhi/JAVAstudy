package com.mings.controller;

import com.mings.domain.Student;
import com.mings.service.StudentService;

import java.util.Scanner;

/**
 * @author MINGS-PC
 */
public class StudentController extends BaseStudentController {

    private static StudentService studentService = new StudentService();
    private static Scanner sc = new Scanner(System.in);
    String stuId;


    //接收学生的信息

    public Student inputStudentInfo(String stuId) {
        while (true){
            System.out.println("请输入学生的学号：");
            stuId = sc.next();
            boolean exists = studentService.isExists(stuId);
            if (exists){
                System.out.println("学号已存在，请重新输入");
            }else {
                break;
            }
        }
        //接收学生的其他信息
        System.out.println("请输入学生的姓名：");
        String tcName = sc.next();
        System.out.println("请输入学生的年龄：");
        int tcAge = sc.nextInt();
        System.out.println("请输入学生的生日：");
        String tcBirthday = sc.next();
        //封装学生对象
        Student stu = new Student();
        stu.setId(stuId);
        stu.setName(tcName);
        stu.setAge(tcAge);
        stu.setBirthday(tcBirthday);
        return stu;
    }
}
