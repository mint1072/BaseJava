package StaticNithyEight;

public class Test1 {
    public static void main(String[] args) {
        //单例设计模式:一个类只有一个对象
        A a1 = A.getObject();
        A a2 = A.getObject();
        System.out.println(a1);
        System.out.println(a2);
    }
}
