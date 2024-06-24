package OneHundredEight;
//接口中除了成员变量和成员方法外不能有其他的 比抽象类还抽象
public interface A {
    //成员变量 -> 常量
    public static final String STUDENT_NAME = "张飞";//可以不写public static final 默认为常量
    //成员方法 -> 抽象方法
    public abstract void run(); //可以不写public abstract 默认为抽象方法 但注意抽象方法不能有方法体
}
