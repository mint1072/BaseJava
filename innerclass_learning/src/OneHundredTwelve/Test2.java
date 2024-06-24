package OneHundredTwelve;

public class Test2 {

    public static void main(String[] args) {
//        Swimming s1 = new Swimming(){
//            @Override
//            public void swim() {
//                System.out.println("喵喵喵");
//            }
//        };
//        go(s1);
        go(new Swimming(){
            @Override
            public void swim() {
                System.out.println("喵喵喵");
            }
        });
    }

    public static void go(Swimming s){
        System.out.println("开始");
        s.swim();
    }
}
interface Swimming{
    void swim();
}
