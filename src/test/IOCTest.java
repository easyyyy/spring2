import bll.StudentService;
import bll.impl.StudentServiceImpl;
import dao.StudentDao;
import dao.impl.StudentDaoImpl;
import entity.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCTest {
    @Test
    public void test1(){
        //启动容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

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

    @Test
    public void test3(){
        //测试生命周期，作用域
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentDao dao = ac.getBean("studentDaoId", StudentDaoImpl.class);
        dao.addStudent();
        StudentDao dao2 = ac.getBean("studentDaoId", StudentDaoImpl.class);
        dao.addStudent();
    }
}
