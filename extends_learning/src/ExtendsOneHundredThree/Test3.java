package ExtendsOneHundredThree;

public class Test3 {
    public static void main(String[] args) {
        Student s1 = new Student("李四", 24);
        System.out.println(s1.getAge());
        System.out.println(s1.getSchoolName());
    }
}

class Student{
    private String name;
    private int age;
    private String schoolName;

    public Student() {
    }

    public Student(String name, int age) {
        this(name, age, "黑马大学"); //调用兄弟构造器 this和super不能同时出现 因为在this里已经对super调用了
    }

    public Student(String name, int age, String schoolName) {
        this.name = name;
        this.age = age;
        this.schoolName = schoolName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
