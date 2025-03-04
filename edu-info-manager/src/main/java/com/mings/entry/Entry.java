package com.mings.entry;

import com.mings.controller.OtherStudentController;
import com.mings.controller.StudentController;
import com.mings.controller.TeacherController;

import java.util.Scanner;

public class Entry {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("-----欢迎使用黑马信息管理系统-----");
            System.out.println("1.学生信息管理 2.教师信息管理 3.退出");
            System.out.println("请输入你的选择：");
            String choice = sc.next();
            switch (choice) {
                case "1":
                    //System.out.println("学生信息管理");
                    //  调用学生控制器的方法
                    OtherStudentController studentController = new OtherStudentController();
                    studentController.start();
                    break;
                case "2":
                    //System.out.println("教师信息管理");
                    TeacherController teacherController = new TeacherController();
                    teacherController.start();
                    break;
                case "3":
                    System.out.println("感谢您的使用！");
                    //  退出正在使用的JVM
                    System.exit(0);
                    break;
                default:
                    System.out.println("输入有误，请重新输入");
                    break;
            }
        }

    }
}
