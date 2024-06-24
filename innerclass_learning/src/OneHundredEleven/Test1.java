package OneHundredEleven;

public class Test1 {
    public static void main(String[] args) {
        //访问静态内部类
        Outer1.Inner1 in = new Outer1.Inner1();
        in.test();
    }
}
