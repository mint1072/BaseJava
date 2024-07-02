package OneThirtySix;

import java.util.ArrayList;
import java.util.HashSet;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();//有序可重复有索引
        list.add("java1");
        list.add("java2");
        list.add("java3");
        list.add("java4");
        System.out.println(list);

        HashSet<String> set = new HashSet<>();//无序不重复无索引
        set.add("se1");
        set.add("se2");
        set.add("se3");
        set.add("se1");
        set.add("se2");
        set.add("se3");
        System.out.println(set);
    }
}
