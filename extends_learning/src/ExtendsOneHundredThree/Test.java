package ExtendsOneHundredThree;

class F {
//    public F(){
//        System.out.println("父类的无参构造器执行了");
//    }
    public F(String name, int age){
        System.out.println("父类的无参构造器执行了");
    }
}

class Z extends F{
    public Z(){
        super("name", 24);
        System.out.println("子类的无参构造器执行了");
    }

    public Z(String name, int age){
        super(name, age);
        System.out.println("子类的有参构造器执行了");
    }
}
public class Test {
    public static void main(String[] args) {
        Z z = new Z("aaa", 24); //子类都默认先调用父类无参构造器
    }
}
