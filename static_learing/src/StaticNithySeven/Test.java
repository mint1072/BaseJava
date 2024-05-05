package StaticNithySeven;

public class Test {
    public static void main(String[] args) {
        //静态代码块 类加载时执行 只执行一次 进行类变量初始化
        System.out.println(Student.age);
//        System.out.println(Student.age);
//        System.out.println(Student.age);
        System.out.println(Student.studentName);

        //实例代码块 创建对象时调用 且在构造器之前被调用
        Student s1 = new Student();
        Student s2 = new Student("理理理理");
    }
}
