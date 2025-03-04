package com.mings.service;

import com.mings.dao.TeacherDao;
import com.mings.domain.Teacher;

public class TeacherService {
    private TeacherDao teacherDao = new TeacherDao();

    public boolean isExists(String tcId) {
        //调用dao层方法，判断是否存在老师
        Teacher[] tcs = teacherDao.findAllTeacher();
        boolean exists = false;
        for (int i = 0; i < tcs.length; i++) {
            Teacher teacher = tcs[i];
            if (teacher != null && teacher.getId().equals(tcId)) {
                exists = true;
                break;
            }
        }
        return exists;
    }

    public Boolean addTeacher(Teacher tc) {
        return teacherDao.addTeacher(tc);
    }

    public Teacher[] findAllTeacher() {
        Teacher[] tcs = teacherDao.findAllTeacher();
        boolean flag = false;
        for (int i = 0; i < tcs.length; i++) {
            Teacher teacher = tcs[i];
            if (teacher != null) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            return null;
        } else {
            return tcs;
        }
    }

    public void deleteTeacherById(String tcId) {
        teacherDao.deleteTeacherById(tcId);

    }

    public void updateTeacher(String tcId, Teacher tc) {
        teacherDao.updateTeacher(tcId, tc);
    }
}
