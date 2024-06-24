package OneHundredTwentySix;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.IntToDoubleFunction;

public class ArraysTest {

    public static void main(String[] args) {
        //public static String toString(数组类型):返回数组内容 直接输出数组打印数组地址 通过toString才是打印内容
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(arr));
        //public static 类型[] copyOfRange(类型[] arr, 起始索引, 结束索引):拷贝数组 包前不包后
        int[] arr1 = Arrays.copyOfRange(arr, 1, 3);
        System.out.println(Arrays.toString(arr1));
        //public static copyOf(类型[] arr, int newlength):拷贝数组 可指定长度
        int[] arr2 = Arrays.copyOf(arr, 3);
        System.out.println(Arrays.toString(arr2));
        //public static setAll(double[] array, IntToDoubleFunction generator):把数组中原数据改成新数据又存进去
        double[] prices = {100, 200, 300};
        Arrays.setAll(prices, new IntToDoubleFunction() {
            @Override
            public double applyAsDouble(int value) {
                return prices[value] *  0.8;
            }
        });
        System.out.println(Arrays.toString(prices));
        //public static void sort(类型[] arr):对数组进行排序 默认升序
        Arrays.sort(prices);
        System.out.println(Arrays.toString(prices));
    }
}
