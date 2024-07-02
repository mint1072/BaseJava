package OneThirtySeven;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class Test1 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("java1");
        c.add("java2");
        c.add("java3");
        System.out.println(c);

        //1.迭代器方法遍历collection
        //从集合对象中获取迭代器对象
//        Iterator<String> iterator = c.iterator();//alt+enter补全代码
 /*       System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());可以用循环代替*/
//        while(iterator.hasNext()){
//            String s = iterator.next();
//            System.out.println(s);
//        }

        //2.增强for类型遍历集合或数组，也是迭代器遍历集合简化写法 直接变量.for自动填充
        for (String s : c){
            System.out.println(s);
        }

        //3.lambda表达式遍历集合
        //default void forEach(Consumer<? super T> action):结合lambda表达式遍历集合
        c.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        /*//简化
        c.forEach((String s)->{
                System.out.println(s);
            });
        c.forEach(s->{
            System.out.println(s);
        });
        c.forEach(s -> System.out.println(s));
        c.forEach(System.out::println);*/
    }
}
