package OneSeventy;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Test1 {
    public static void main(String[] args) throws Exception {
        //键值对数据存到属性文件中去
        Properties proterties = new Properties();//键值对容器
        proterties.setProperty("lili", "576");//存入键值对
        proterties.setProperty("yiyi", "576");
        proterties.setProperty("rutu", "890");
        proterties.setProperty("rutu", "890");
        proterties.store(new FileWriter("LogFile/src/OneSeventy/test1.properties"), "test");

    }
}
