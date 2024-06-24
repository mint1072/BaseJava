package OneHundredfiteen;

import OneHundredForteen.Dog;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        String rs = test("Java");
        System.out.println(rs);

        ArrayList<Car> a =new ArrayList<>();
        a.add(new BMW());
        a.add(new BenZi());
        go(a);

        ArrayList<BMW> b = new ArrayList<>();
        b.add(new BMW());
        b.add(new BMW());
        go(b);

        ArrayList<BenZi> c = new ArrayList<>();
        c.add(new BenZi());
        c.add(new BenZi());
        go(c);

//        ArrayList<Dog> D = new ArrayList<>();
//        go(D);
    }

    public static <T> T test(T t){
        return t;
    }
//? extends Car为上限 ? super Car为下限
    public static void go(ArrayList<? extends Car> c){//可以直接使用通配符 ?通配符 代表一切对象 如果有限定 使用extends

    }
//    public static<T extends Car> void go(ArrayList<T> c){
//
//    }
}
