package StaticNithySix;

public class Student {
    static int age;
    double score;
   public static void printHelloWorld(){
       System.out.println(age);
//       System.out.println(score);
//       System.out.println(scorePass());
   }
   public void scorePass(){
       System.out.println(age);
       System.out.println(score);
       printHelloWorld();
   }

}
