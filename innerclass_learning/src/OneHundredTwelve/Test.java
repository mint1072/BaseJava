package OneHundredTwelve;

public class Test {
    public static void main(String[] args) {
//        Animal a = new Cat();
//        a.cry();
        //匿名内部类
        Animal a = new Animal(){
            @Override
            public void cry() {
                System.out.println("喵喵喵");
            }
        };
        a.cry();
    }
}
//class Cat extends Animal{
//
//    @Override
//    public void cry() {
//        System.out.println("喵喵喵");
//    }
//}

abstract class Animal{
    public abstract void cry();
}
