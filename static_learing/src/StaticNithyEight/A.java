package StaticNithyEight;

public class A {
    //构造器私有
    private A(){

    }
    //创建类变量存放对象
    private static A a = new A();

    //创建类方法返回对象
    public static A getObject(){
        return a;
    }
}
