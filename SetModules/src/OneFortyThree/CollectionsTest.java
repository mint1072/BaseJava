package OneFortyThree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsTest {//操作集合的工具类
    public static void main(String[] args) {
        //1.public static <T> boolean addAll(Collection<? super T> c, T...elements)：为集合批量添加数据
//        List<String> list = new ArrayList<>();
       /* list.add("ioi");
        list.add("rty");
        list.add("rui"); 一行一行使用自带方法添加元素比较冗余*/
//        Collections.addAll(list, "354", "ryuwi","tuiero");
//        System.out.println(list);

        //2.public static void shuffle(List<?> list):打乱List集合中的元素顺序
//        Collections.shuffle(list);
//        System.out.println(list);
        //3.public static <T> void sort(List<T> list):对集合中元素进行升序排序
       /* List<Integer> test = new ArrayList<>();
        Collections.addAll(test, 45, 56,4, 5);
        Collections.sort(test);
        System.out.println(test);*/
        //4.public static <T> void sort(List<T> list, Comparator<? super T> c):根据比较器指定规则
        List<Student> students = new ArrayList<>();
        students.add(new Student("lili", 23, 67.5));
        students.add(new Student("yuti", 26, 78.9));
        students.add(new Student("tyru", 26, 45.6));
        students.add(new Student("tyru", 2, 78.9));
//        Collections.sort(students);
        Collections.sort(students, (o1, o2)->Double.compare(o1.getAge(), o2.getAge()));
        System.out.println(students);
    }
}
