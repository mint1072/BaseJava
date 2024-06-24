package OneHundredTwentySeven;
//可使用lambda表达式来简化匿名内部类 但只能针对函数式接口
public class Test {
    public static void main(String[] args) {
        Student S = new Student(){ //匿名内部类 Student子类对象
            @Override
            public void run() {
                System.out.println("学生");
            }
        };
        S.run();

//        Swimming swimming = new Swimming() {//匿名内部类重写
//            @Override
//            public void swim() {
//                System.out.println("学生在游泳");
//            }
//        };
//        swimming.swim();

        Swimming swimming = ()->{//lambda表达式简化
            System.out.println("学生在游泳");
        };
        swimming.swim();
    }
}

abstract class Student{
    public abstract void run();
}

interface Swimming{
    void swim();
}
