package OneForty;

import java.util.HashSet;
import java.util.Set;

public class SetTest1 {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Student("lili", 34, 97));
        students.add(new Student("lolo", 35, 98));
        students.add(new Student("lolo", 35, 98));
        students.add(new Student("yiyi", 23, 48));
        System.out.println(students);
    }
}
