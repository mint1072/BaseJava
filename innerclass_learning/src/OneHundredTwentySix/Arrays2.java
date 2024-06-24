package OneHundredTwentySix;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays2 {
    public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0] = new Student("蜘蛛精", 169.5, 34);
        students[1] = new Student("紫霞", 163.8, 25);
        students[2] = new Student("紫霞", 163.8, 25);
        students[3] = new Student("孙悟空", 156.8, 25);
        Arrays.sort(students);//1.将Student类实现Comparable接口 并重写compareTo方法 自定义比较规则
        System.out.println(Arrays.toString(students));
        Arrays.sort(students, new Comparator<Student>() { //2.数组为类类型进行比较时候，可以直接使用接口的匿名内部类Comparator
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o1.getHeight(), o2.getHeight());
            }
        });
        System.out.println(Arrays.toString(students));
    }
}
