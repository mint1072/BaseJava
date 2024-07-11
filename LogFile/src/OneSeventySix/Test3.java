package OneSeventySix;

public class Test3 {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 5; i++) {
            System.out.println("当前数字为" + i);
            if (i == 3) Thread.sleep(5000);//休眠多少秒
        }
    }
}
