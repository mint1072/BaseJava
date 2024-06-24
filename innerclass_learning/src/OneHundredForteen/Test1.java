package OneHundredForteen;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
//        list.add("java1");
//        list.add("java2");
//        list.add("java3");
////        list.add(new Cat());
//        for (int i = 0; i < list.size(); i++) {
//            String s = (String) list.get(i);
//            System.out.println(s);
//        }

        System.out.println("------------------------");
        ArrayList<String> list1 =  new ArrayList<String>();
        list1.add("java1");
        list1.add("java2");
        list1.add("java3");
//        list1.add(new Cat());
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
    }
}

class Cat{

}
