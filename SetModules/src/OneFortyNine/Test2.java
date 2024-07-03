package OneFortyNine;

import java.util.*;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {
        //1.针对几何list使用Stream流
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "白骨精", "蜘蛛精", "牛魔王", "孙悟空", "水帘洞");
        System.out.println(list);

        Stream<String> stream = list.stream();
        stream.filter(s->s.endsWith("精")).forEach(System.out::println);
        //2.针对集合Set使用Stream流
        Set<String> set = new HashSet<>();
        Stream<String> stream1 = set.stream();
        //3.针对Map使用Stream流 两种 分别对键和值进行stream 或者使用ENtry作为整体
        Map<String, Integer> map = new HashMap<>();
        //分别对键和值
        Set<String> set1 = map.keySet();
        Stream<String> stream2 = set1.stream();
        Collection<Integer> values = map.values();
        Stream<Integer> stream3 = values.stream();
        //键值作为整体
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Stream<Map.Entry<String, Integer>> stream4 = entries.stream();
        stream4.filter(s->s.getKey().contains("白")).forEach(s-> System.out.println(s.getKey() + s.getValue()));
        //4.针对数组使用Stream流 两种获取Stream方法 一个是Arrays默认方法streams 一个是Stream默认方法of
        String[] names = {"张", "里", "体"};

        Stream<String> stream5 = Arrays.stream(names);

        Stream<String> names1 = Stream.of(names);

    }
}
