package StaticNithyFour;

public class Student {
   double score;
    public static void printHelloWorld(){
        System.out.println("HelloWorld!");
        System.out.println("HelloWorld!");
    }
    public void studentPass(){
        System.out.println((score > 60 ? "及格" : "不及格"));
    }
}
