package StaticNithyThree;

public class Test {
    public static void main(String[] args) {
        Student.name = "原话";
        System.out.println(Student.name);
        Student s1 = new Student();
        s1.name = "梨花";
        Student s2 = new Student();
        s2.name = "催化";
        System.out.println(Student.name);
        s1.age = 24;
        System.out.println(s1.age);
        s2.age = 25;
        System.out.println(s2.age);
    }
}
