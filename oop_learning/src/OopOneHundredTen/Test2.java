package OopOneHundredTen;

public class Test2 {
    public static void main(String[] args) {
        Zi Z = new Zi();
        Z.run();
    }
}
//一个接口继承多个接口时 必须不存在方法冲突
interface I{
    void test1();
}
interface J{
    String test1();
}
//interface M extends I, J{}
////一个类实现多个接口时 必须不存在方法冲突
//class N implements I, J{
//
//}
//类继承了父类 又实现了接口 出现同名方法优先使用父类的
class Fu{
    public void run(){
        System.out.println("父类的run方法执行了");
    }
}
interface  It{
    default void run(){
        System.out.println("接口");
    }
}
class Zi extends Fu implements It{

}

//一个类实现了多个接口 多个接口中存在同名默认方法 不冲突 这个实现类重写该方法就行
interface It1{
    default void run(){
        System.out.println("It1");
    }
}
interface It2{
    default void run(){
        System.out.println("It2");
    }
}
class I11 implements It1, It2{


    @Override
    public void run() {
        It1.super.run();
    }
}
