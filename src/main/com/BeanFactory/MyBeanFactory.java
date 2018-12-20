package BeanFactory;

import entity.Student;

/**
 * 静态工厂类
 */
public class MyBeanFactory {
    public static Student createStudent(){
        return new Student();
    }
}
