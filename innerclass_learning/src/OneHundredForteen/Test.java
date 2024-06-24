package OneHundredForteen;

public class Test {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("java1");
        list.add("java2");
        list.add("java3");
        String s = list.get(1);
        System.out.println(s);
        MyClass2<Animal, Dog> c2 = new MyClass2<>();
        MyClass3<Animal> b = new MyClass3<>();

    }
}
