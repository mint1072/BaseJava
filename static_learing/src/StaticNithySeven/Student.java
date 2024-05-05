package StaticNithySeven;

public class Student {
    static int age = 24;
    static String studentName;
    //静态代码块
    static{
        System.out.println("静态代码块执行了");
        studentName = "李飞";
    }
    //实例代码块
    {
        System.out.println("实例代码块执行了");
    }
    public Student(){
        System.out.println("调用了无参构造器");

    }
    public Student(String name){
        System.out.println("调用了有参构造器");
    }
}
