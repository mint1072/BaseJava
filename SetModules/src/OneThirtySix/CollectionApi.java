package OneThirtySix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionApi {
    public static void main(String[] args) {
        //Collection :public boolean add(E e)
        Collection<String> c = new ArrayList<>();//collection是接口只能多态写法
        c.add("java1");
        c.add("java2");
        c.add("java3");
        c.add("java1");
        System.out.println(c);
        //public void clear():清空内容
//        c.clear();
        System.out.println(c);
        //public boolean isEmpty():判断是否为空为空返回true
        System.out.println(c.isEmpty());
        //public int size():判断集合大小
        System.out.println(c.size());
        //public boolean remove():删除某元素 如果有重复 默认第一个1
        c.remove("java1");
        System.out.println(c.remove("Java1"));
        System.out.println(c);
        //public boolean contains(Object obj):判断集合中是否包含某个元素
        System.out.println(c.contains("java1"));
        //public Object[] toArray():把集合转换成数组
//        String[] s = c.toArray(new String[c.size()]); //如果list里是单一的数据类型 可以以这种形式
        Object[] arr = c.toArray();
        System.out.println(Arrays.toString(arr));
        //把一个集合中全部数据倒入另一个集合中去
        Collection<String> c1 = new ArrayList<>();
        c1.add("java2");
        c1.add("java3");
        Collection<String> c2 = new ArrayList<>();
        c2.add("java4");
        c2.add("java5");
        c1.addAll(c2);
        System.out.println(c1);

    }
}
