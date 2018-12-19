package entity;

public class Student {
    private String id;
    private String name;
    private String sex;
    private StudentClass stuClass;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public StudentClass getStuClass() {
        return stuClass;
    }

    public void setStuClass(StudentClass stuClass) {
        this.stuClass = stuClass;
    }

    public void print(){
        System.out.println("该学生信息--学号："+this.id+",姓名："+this.name+",性别："+this.sex+",所属班级："+this.stuClass.getName());

    }
}