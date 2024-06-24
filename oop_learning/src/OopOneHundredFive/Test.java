package OopOneHundredFive;

public class Test {
    public static void main(String[] args) {
        final int a;
        a=110;
    }
}
//final修饰类，类不能被继承
final class A{
    public static final String NAME = "张飞"; //必须先赋值 常量
    public final int age = 24; //必须先赋值
}
//class B extends A{
//
//}
//final修饰方法时不能够被重写
class C{
    public final void run(){}
}
//class D extends C{
//    @Override
//}
//final修饰变量 可修饰三种变量 一个局部变量 一个静态成员变量 一个实例变量
