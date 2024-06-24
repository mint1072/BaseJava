package OneHundredsixteen;

public class Test {
    public static void main(String[] args) {
        //Object提供的常用方法 所有类的父类就是Object
        Student s = new Student("li", 23);
        System.out.println(s.toString());//toString 默认是输出对象地址 输出对象时不加toString就是调用的toString
        Student s1 = new Student("li", 23);//Objects默认比较的是两个对象地址 可以重写
        System.out.println(s1.equals(s));

    }
}
