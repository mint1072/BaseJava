package OneFifty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        //stream提供的中间方法 成绩变量和学生类两个类型
        List<Double> scores = new ArrayList<>();
        Collections.addAll(scores, 87.5, 56.7, 90.8, 23.4, 34.5);
//        System.out.println(scores);
        List<Student> students = new ArrayList<>();
        students.add(new Student("lili", 34, 168.9));
        students.add(new Student("titi", 56, 178.6));
        students.add(new Student("yiyi", 78, 186.6));
        students.add(new Student("erer", 45, 156.6));
        students.add(new Student("erer", 45, 156.6));
//        System.out.println(students);
        //找出成绩大于等于60的数据 并升序再输出
//        scores.stream().filter(s -> s >= 50 ).sorted().forEach(System.out::println);
//        //找出年龄大于等于23且小于等于30的学生 并按照年龄降序输出
//        students.stream().filter(s -> s.getAge() >= 30 && s.getAge() <= 80).sorted((s1, s2) -> s2.getAge() - s1.getAge()).
//                forEach(System.out::println);
//        //取出身高最高的前三名学生并输出
//        students.stream().sorted((s1, s2) -> Double.compare(s2.getHeight(), s1.getHeight())).limit(3).forEach(System.out::println);
//        //取出身高倒数的两名学生并输出
//        students.stream().sorted((s1, s2) -> Double.compare(s2.getHeight(), s1.getHeight())).skip(4).
//                forEach(System.out::println);
//        //取出升高高于156 学生并输出他的姓名 要求去重
//        students.stream().filter(s -> s.getHeight() > 156).map(s -> s.getName()).distinct().forEach(System.out::println);

        //要求去掉重复学生对象的话得重写hashcode 与equals方法 因为map只会针对对象其中一个属性进行去重 而两个对象地址不一样
        students.stream().filter(s -> s.getHeight() > 156).distinct().forEach(System.out::println);
    }
}
