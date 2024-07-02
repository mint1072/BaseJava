package OneFortySix;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class MapTest1 {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();
        map.put("iop", 162.4);
        map.put("iop", 156.4);
        map.put("fhk", 134.0);
        map.put("yoi", 185.6);
        map.put("rty", 165.6);
        System.out.println(map);
        //三种遍历map集合方式
        //1.使用键来遍历值
        Set<String> set = map.keySet();
        for (String s : set) {
            System.out.println(map.get(s));
        }

        //2.键值对遍历方式
        Set<Map.Entry<String, Double>> entries = map.entrySet();//ctrl+alt+v补全代码
        for (Map.Entry<String, Double> entry : entries) {
            System.out.println(entry.getKey() + entry.getValue());
        }

        //3.lambda表达式
//        map.forEach((k, v)->{
//            System.out.println(k + v);
//        });
        map.forEach(( s,  v) ->{
                System.out.println(s + v);});
    }
}
