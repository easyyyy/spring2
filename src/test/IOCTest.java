import bll.StudentService;
import bll.impl.StudentServiceImpl;
import entity.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCTest {
    @Test
    public void test1(){
        //启动容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("");
        //获取bean
        Student student = ac.getBean("stu", Student.class);
        //执行
        student.print();
    }

    @Test
    public void test2(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService studentService = ac.getBean("stuServiceId", StudentServiceImpl.class);
        studentService.addStudent();
    }
}
