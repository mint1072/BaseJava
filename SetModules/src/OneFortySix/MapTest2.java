package OneFortySix;

import java.util.*;

public class MapTest2 {
    public static void main(String[] args) {
        //统计八十个学生对四个景点投票情况
        //随机八十次
        List<String> list = new ArrayList<>();
        String[] selects = {"A", "B", "C", "D"};
        Random random = new Random();
        for (int i = 0; i < 80; i++) {
            int index = random.nextInt(4);
            list.add(selects[index]);
        }
        System.out.println(list);
        //创建统计票数的map
        Map<String, Integer> map = new HashMap<>();
        //开始计票
        for (String s : list) {
            if (map.containsKey(s)) map.put(s, map.get(s) + 1);
            else map.put(s, 1);
        }
        System.out.println(map);
    }
}
