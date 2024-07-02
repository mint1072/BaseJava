package OneForty;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {
        //创建Set集合对象
//        Set<String> set = new HashSet<>();//只无序一次 无序 不重复 五索引
//        Set<String> set = new LinkedHashSet<>();//有序 不重复 五索引
        Set<String> set = new TreeSet<>();//默认升序 不重复 五索引
        set.add("345");
        set.add("345");
        set.add("234");
        set.add("234");
        set.add("234567");
        System.out.println(set);
    }
}
