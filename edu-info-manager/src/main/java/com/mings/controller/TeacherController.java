package com.mings.controller;

import com.mings.domain.Teacher;
import com.mings.service.TeacherService;
import com.mings.service.TeacherService;

import java.util.Scanner;

/**
 * @author MINGS-PC
 */
public class TeacherController {

    private static TeacherService teacherService = new TeacherService();
    private static Scanner sc = new Scanner(System.in);
    String tcId;
    public void start() {
        teacherLoop:
        while (true) {
            System.out.println("--------欢迎来到 <老师> 管理系统--------");
            System.out.println("请输入您的选择: 1.添加老师  2.删除老师  3.修改老师  4.查看老师  5.退出");
            String choice = sc.next();
            switch (choice) {
                case "1":
                    addTeacher();
                    break;
                case "2":
                    deleteTeacherById();
                    break;
                case "3":
                    updateTeacher();
                    break;
                case "4":
                    findAllTeacher();
                    break;
                case "5":
                    System.out.println("感谢您使用老师管理系统，再见！");
                    break teacherLoop;
                default:
                    System.out.println("输入有误，请重新输入");
                    break;
            }
        }
    }

    //修改老师
    public void updateTeacher() {
        Teacher tc = inputTeacherInfo();
        //将封装好的老师对象，传递给service层
        teacherService.updateTeacher(tcId,tc);
        System.out.println("修改成功");
    }

    //删除老师
    public void deleteTeacherById() {
        String tcId = inputTeacherId();
        teacherService.deleteTeacherById(tcId);
        System.out.println("删除成功");
    }



    //查看老师
    public void findAllTeacher() {
        Teacher[] tcs = teacherService.findAllTeacher();
        if (tcs == null) {
            System.out.println("老师信息为空，请添加老师信息");
            return;
        } else {
            System.out.println("工号\t\t姓名\t\t年龄\t\t生日");
            for (int i = 0; i < tcs.length; i++) {
                Teacher tc = tcs[i];
                if (tc != null) {
                    System.out.println(tc.getId() + "\t" + tc.getName() + "\t\t" + tc.getAge() + "\t\t" + tc.getBirthday());
                }
            }
        }
    }

    // 添加老师
    public void addTeacher() {
        Teacher tc = inputTeacherInfo();
        //将封装好的老师对象，传递给service层
        Boolean result = teacherService.addTeacher(tc);
        if (result){
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }
    }

    public String inputTeacherId() {
        while (true) {
            System.out.println("请输入老师的工号：");
            tcId = sc.next();
            boolean exists = teacherService.isExists(tcId);
            if (!exists) {
                System.out.println("工号不存在，请重新输入");
            } else {
                break;
            }
        }
        return tcId;
    }

    //接收老师的信息
    private Teacher inputTeacherInfo() {
        while (true){
            System.out.println("请输入老师的工号：");
            tcId = sc.next();
            boolean exists = teacherService.isExists(tcId);
            if (exists){
                System.out.println("工号已存在，请重新输入");
            }else {
                break;
            }
        }
        //接收老师的其他信息
        System.out.println("请输入老师的姓名：");
        String tcName = sc.next();
        System.out.println("请输入老师的年龄：");
        int tcAge = sc.nextInt();
        System.out.println("请输入老师的生日：");
        String tcBirthday = sc.next();
        //封装老师对象
        Teacher tc = new Teacher();
        tc.setId(tcId);
        tc.setName(tcName);
        tc.setAge(tcAge);
        tc.setBirthday(tcBirthday);
        return tc;
    }
}
