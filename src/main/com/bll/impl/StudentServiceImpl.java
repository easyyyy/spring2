package bll.impl;

import bll.StudentService;
import dao.StudentDao;

public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao;



    @Override
    public void addStudent() {
        System.out.println("addStudent- -byService");
    }

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }
}
