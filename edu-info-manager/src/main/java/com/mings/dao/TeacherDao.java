package com.mings.dao;

import com.mings.domain.Teacher;

/**
 * @author MINGS-PC
 */
public class TeacherDao {
    private static Teacher[] tcs = new Teacher[5];
    public Boolean addTeacher(Teacher tc) {
        int index = -1;
        for (int i = 0; i < tcs.length; i++) {
            Teacher teacher = tcs[i];
            if (teacher ==null){
                index =i;
            break;
            }
        }
        if (index == -1) {
            return false;
        }else {
        tcs[index] = tc;
        }
        return true;
    }

    public Teacher[] findAllTeacher() {
        return tcs;
    }

    public void deleteTeacherById(String tcId) {
        int index = getIndex(tcId);
        tcs[index] = null;
    }

    public int getIndex(String tcId){
        int index = -1;
        for (int i = 0; i < tcs.length; i++) {
            if (tcs[i] != null && tcs[i].getId().equals(tcId)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public void updateTeacher(String tcId, Teacher tc) {
        int index = getIndex(tcId);
        tcs[index] = tc;
    }
}
