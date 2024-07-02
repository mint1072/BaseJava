package OnethirtyEight;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        //1.创建Arraylist集合对象(有序、可重复、有索引)
        /**
         * ArrayList 实际上继承自 AbstractList，而 AbstractList 继承自 AbstractCollection AbstractCollection 实现了toString方法
         */
        List<String> list = new ArrayList<>();
        list.add("1223");
        list.add("1233");
        list.add("1243");
        System.out.println(list.toString());
        //2.public void add(int index, E element) 指定索引插入元素
        list.add(1, "1233");
        System.out.println(list);
        //3.public E remove(int index) 指定索引删除元素 返回被删除元素
        System.out.println(list.remove(2));
        System.out.println(list);
        //4.public E get(int index)返回指定位置元素
        System.out.println(list.get(2));
        //4.public E set(int index, E element)修改索引位置元素 修改成功返回原来数据
        System.out.println(list.set(2, "12345"));
        System.out.println(list);

    }
}
