package OneHundredEleven;

public class Test {
    public static void main(String[] args) {
        //成员内部类
        Outer.Inner i = new Outer().new Inner();
        i.getName();
    }
}
