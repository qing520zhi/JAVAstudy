package com.mings.factory;


import com.mings.dao.BaseStudentDao;
import com.mings.dao.OtherStudentDao;
import com.mings.dao.StudentDao;

/**
 * @projectName: AdvancedDeom
 * @package: com.mings.factory
 * @className: StudentDaoFactory
 * @author: mings
 * @description: TODO
 * @date: 2025/2/27 20:36
 * @version: 1.0
 */
public class StudentDaoFactory {
    public static BaseStudentDao getStudentDao() {
        return new StudentDao();
    }
}
