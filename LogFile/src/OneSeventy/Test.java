package OneSeventy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Set;

public class Test {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();//键值对容器 读取键值对数据
        System.out.println(properties);
        properties.load(new FileInputStream("LogFile/src/OneSeventy/test.properties"));
        System.out.println(properties);
        System.out.println(properties.getProperty("lili"));
        Set<String> set = properties.stringPropertyNames();
        for (String s : set) {
            System.out.println(properties.getProperty(s));
        }

        properties.forEach((k, v) -> {System.out.println(k + "->" + v);});
    }
}
