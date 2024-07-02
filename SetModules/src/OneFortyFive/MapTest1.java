package OneFortyFive;

import com.sun.source.tree.Tree;

import java.util.*;

public class MapTest1 {
    public static void main(String[] args) {
        //1.添加元素 无序 不重复 五索引
//        Map<String, Integer> map = new HashMap<>();
//        Map<String, Integer> map = new LinkedHashMap<>();
        Map<String, Integer> map = new TreeMap<>();
        map.put("io", 23);
        map.put("yi", 53);
        map.put("yi", 33);
        map.put("tu", 33);
        map.put("oi", 33);
        System.out.println(map);
        //2.public int size() 集合大小
        System.out.println(map.size());
        //3.public int clear()清除集合元素
//        map.clear();
//        System.out.println(map);
        //4.public boolean isEmpty():判断是否为空 为空返回True
        System.out.println(map.isEmpty());
        //5.public V get(Object key):根据键捕获对应值
        System.out.println(map.get("io"));
        //6.public V remove(Object key):根据键删除某个元素
        System.out.println(map.remove("tu"));
        //7.public boolean containsKey(Object key):判断是否包含某个键 包含返回True
        System.out.println(map.containsKey("yi"));
        //8.public boolean containsValue(Object key):判断是否包含某个值 包含返回True
        System.out.println(map.containsValue(33));
        //9.public Set<K> keySet():获取Map集合全部键
        Set<String> set = map.keySet();
        System.out.println(set);
        //10.public Collection<V> values():获取Map集合全部值
        Collection<Integer> values = map.values();
        System.out.println(values);

        //11.把其他Map集合的数据倾倒 使用putAll
        Map<String, Integer> map1 = new HashMap<>();


    }
}
