package OneHundredEleven;

public class Outer1 {
    private int aaa;
    public static String studentName = "张飞";
    //静态内部类
    public static class Inner1{ //相当于类里面的静态方法
        private String name;
        public static int age;
        public void test(){
            System.out.println("staticinnerclass");
//            System.out.println(aaa);
            System.out.println(studentName);
        }
    }
}
