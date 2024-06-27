import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println(getMoney());
                break;
            } catch (Exception e) {
                System.out.println("请您输入合法的数字价格");
//                throw new RuntimeException(e);
            }
        }
    }

    public static double getMoney(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入价格");
            double money = sc.nextDouble();
            if(money > 0){
                return money;
            }else{
                System.out.println("您输入的价格不合适");
            }
        }
    }
}
