package com.mings.controller;

import com.mings.domain.Student;
import com.mings.service.StudentService;

import java.util.Scanner;

/**
 * @author MINGS-PC
 */
public abstract class BaseStudentController {


    private static  StudentService studentService = new StudentService();
    private static  Scanner sc = new Scanner(System.in);
    String stuId;
    public final void start() {
        studentLoop:
        while (true) {
            System.out.println("--------欢迎来到 <学生> 管理系统--------");
            System.out.println("请输入您的选择: 1.添加学生学生  2.删除学生  3.修改学生  4.查看学生  5.退出");
            String choice = sc.next();
            switch (choice) {
                case "1":
                    addStudent();
                    break;
                case "2":
                    deleteStudentById();
                    break;
                case "3":
                    updateStudent();
                    break;
                case "4":
                    findAllStudent();
                    break;
                case "5":
                    System.out.println("感谢您使用学生管理系统，再见！");
                    break studentLoop;
                default:
                    System.out.println("输入有误，请重新输入");
                    break;
            }
        }
    }

    //修改学生
    public final void updateStudent() {
        Student stu = inputStudentInfo(stuId);
        //将封装好的学生对象，传递给service层
        studentService.updateStudent(stuId,stu);
        System.out.println("修改成功");
    }

    //删除学生
    public final void deleteStudentById() {
        String stuId = inputStudentId();
        studentService.deleteStudentById(stuId);
        System.out.println("删除成功");
    }



    //查看学生
    public final void findAllStudent() {
        Student[] stus = studentService.findAllStudent();
        if (stus == null) {
            System.out.println("学生信息为空，请添加学生信息");
            return;
        } else {
            System.out.println("学号\t\t姓名\t\t年龄\t\t生日");
            for (Student stu : stus) {
                if (stu != null) {
                    System.out.println(stu.getId() + "\t" + stu.getName() + "\t\t" + stu.getAge() + "\t\t" + stu.getBirthday());
                }
            }
        }
    }

    // 添加学生
    public final void addStudent() {
        Student stu = inputStudentInfo(stuId);
        //将封装好的学生对象，传递给service层
        Boolean result = studentService.addStudent(stu);
        if (result){
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }
    }

    public String inputStudentId() {
        while (true) {
            System.out.println("请输入学生的学号：");
            stuId = sc.next();
            boolean exists = studentService.isExists(stuId);
            if (!exists) {
                System.out.println("学号不存在，请重新输入");
            } else {
                break;
            }
        }
        return stuId;
    }

    //接收学生的信息
    public abstract Student inputStudentInfo(String stuId);
}
