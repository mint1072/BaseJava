package OneFifty;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
        //Stream常见的终结方法 终结stream流 无法继续使用stream流提供的方法
        List<Student> students = new ArrayList<>();
        students.add(new Student("lili", 34, 168.9));
        students.add(new Student("titi", 56, 178.6));
        students.add(new Student("titi", 56, 178.6));
        students.add(new Student("yiyi", 78, 186.6));
        students.add(new Student("erer", 45, 156.6));
        students.add(new Student("erer", 45, 156.6));
//        //1.计算出身高超过168的学生人数
//        System.out.println(students.stream().filter(s -> s.getHeight() > 168).count());
//        //2. 身高最高的学生对象
//        System.out.println(students.stream().max((s1, s2) -> Double.compare(s1.getHeight(), s2.getHeight())).get());
//        //3. 身高最矮的学生对象
//        System.out.println(students.stream().min((s1, s2) -> Double.compare(s1.getHeight(), s2.getHeight())).get());
        //4. 身高超过170学生对象 并使用新集合返回
//        List<Student> collect = students.stream().filter(s -> s.getHeight() > 170).collect(Collectors.toList());
//        System.out.println(collect);
        System.out.println(students.stream().filter(s -> s.getHeight() > 170).distinct().collect(Collectors.toList())); //都是针对自定义类型去重 所以需要重写hashcode与equals方法
        System.out.println(students.stream().filter(s -> s.getHeight() > 170).distinct().collect(Collectors.toSet()));
        System.out.println(students.stream().filter(s -> s.getHeight() > 170).distinct().collect(Collectors.toMap(s -> s.getName(), s -> s.getHeight())));
        //5. 身高超过170学生对象 并把学生对象名字和身高存到数组中返回
        Object[] array = students.stream().filter(s -> s.getHeight() > 170).toArray();//不指定类型
        System.out.println(Arrays.toString(array));

        Student[] array1 = students.stream().filter(s -> s.getHeight() > 170).toArray(s -> new Student[s]); //指定存放类型
        System.out.println(Arrays.toString(array1));
    }
}
