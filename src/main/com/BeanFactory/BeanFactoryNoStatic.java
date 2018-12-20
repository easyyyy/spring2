package BeanFactory;

import entity.Student;

public class BeanFactoryNoStatic {
    public Student createStudent(){
        return new Student();
    }
}
