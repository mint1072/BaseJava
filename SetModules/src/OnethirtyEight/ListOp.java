package OnethirtyEight;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ListOp {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1223");
        list.add("1233");
        list.add("1243");
        System.out.println(list);
        //四种访问list类型数据
        //1.for循环遍历 有索引比collection多了普通for循环遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //2.迭代器
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //3.增强for
        for (String s : list) {
            System.out.println(s);
        }
        //4.lambda表达式
//        list.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });
//        //简化
//        list.forEach((String s)->{
//                System.out.println(s);
//            }
//        );
//        list.forEach(s->{
//                    System.out.println(s);
//                }
//        );
//        list.forEach(s -> System.out.println(s));
        list.forEach(System.out::println);
    }
}
