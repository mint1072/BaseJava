package OneFortyNine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "op", "etr", "rty", "iop");
        System.out.println(list);
//        for (String s : list) {
//            if (s.startsWith("o") && s.length() == 2) System.out.println(s);
//        } //普通使用if条件
        //使用Stream流 主要优化集合或者数组使用
        System.out.println(list.stream().filter(s -> s.startsWith("o")).filter(a -> a.length() == 2).collect(Collectors.toList()));
    }
}
