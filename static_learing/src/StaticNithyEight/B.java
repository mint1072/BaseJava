package StaticNithyEight;

public class B {
    //类构造器私有
    private B(){

    }
    //定义一个类变量记录对象
    private static B b;
    //创建一个方法返回对象
    public static B getInstance(){
        if(b == null) b = new B();
        return b;
    }
}
