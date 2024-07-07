package OneSixtyTwo;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        //针对aaa.txt排序
        List<String> list = new ArrayList<>();
        try(Reader f = new FileReader("FIleOP/src/OneSixtyTwo/aaa.txt");
            BufferedReader fr = new BufferedReader(f);
            Writer f1 = new FileWriter("FIleOP/src/OneSixtyTwo/bbb.txt");
            BufferedWriter fw = new BufferedWriter(f1);
        ) {
            String strings;
            while ((strings = fr.readLine()) != null) {
                list.add(strings);
                System.out.println(list);
            }
            Collections.sort(list);
            System.out.println(list);
            for (String s : list) {
                fw.write(s);
                fw.newLine();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
