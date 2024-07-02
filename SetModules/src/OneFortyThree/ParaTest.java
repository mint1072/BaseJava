package OneFortyThree;

import java.util.Arrays;

public class ParaTest {
    public static void main(String[] args) {
        test();
        test(90);
        test(23,34);
        test(23,34,56);
        test(new int[]{23,34,67});
    }
    //一个形参列表里只能有一个可变参数
    //可变参数必须放在最右边 很像默认参数
    public static void test(int...nums){ //本质上就是一个数组
        System.out.println(nums.length);
        System.out.println(Arrays.toString(nums));
        System.out.println("——————————————————————————————————");
    }
}
