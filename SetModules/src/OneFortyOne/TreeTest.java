package OneFortyOne;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeTest {
    public static void main(String[] args) {
//        Set<Integer> set1 = new TreeSet<>();
//        set1.add(4);
//        set1.add(3);
//        set1.add(7);
//        set1.add(7);
//        System.out.println(set1);

//        Set<Student> students =  new TreeSet<>(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return Double.compare(o1.getScore(),o2.getScore());
//            }
//        });
        Set<Student> students =  new TreeSet<>((o1, o2)->Double.compare(o1.getScore(),o2.getScore()));
        students.add(new Student("lili", 23, 34));
        students.add(new Student("tyty", 46, 45));
        students.add(new Student("tyty", 46, 45));
        students.add(new Student("hkll", 45, 89));
        students.add(new Student("tytu", 56, 90));
        students.add(new Student("reytye", 67, 54));
        System.out.println(students);
    }
}
