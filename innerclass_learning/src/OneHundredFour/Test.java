package OneHundredFour;

public class Test {
    public static void main(String[] args) {
        A a = A.X;
        System.out.println(a);

        A[] as = A.values(); //得到所有的枚举对象
        A a3 = A.valueOf("Z");//通过常量命拿到对象
        System.out.println(a3.name());//拿到名字
        System.out.println(a3.ordinal());//拿到索引

        B b = B.Y;
        b.go();
    }
}
