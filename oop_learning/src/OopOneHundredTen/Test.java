package OopOneHundredTen;

public class Test {
    public static void main(String[] args) {
        B b = new B();
        b.test1();
        A.test3();
    }
}

interface C{
    void testC();
}
interface D{
    void testD();
}
interface E extends C, D{ //接口的多继承 可将多个接口的方法都继承过来 也就是整合成一个接口

}
class F implements E{ //所以写类实现接口时只需要写一个接口就成

    @Override
    public void testC() {

    }

    @Override
    public void testD() {

    }
}

