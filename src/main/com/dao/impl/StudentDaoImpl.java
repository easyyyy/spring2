package dao.impl;

import dao.StudentDao;

public class StudentDaoImpl implements StudentDao {

    public void init(){
        System.out.println("stuDao--init()");
    }
    public void destroy(){
        System.out.println("stuDao--destroy()");
    }


    @Override
    public void addStudent() {
        System.out.println("addStudent- -byDao");
    }
}
