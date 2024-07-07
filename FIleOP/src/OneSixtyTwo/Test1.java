package OneSixtyTwo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class Test1 {
    public static void main(String[] args) {
        try(Reader f = new FileReader("FIleOP/src/OneSixtyOne/aaa.txt");
            BufferedReader fr = new BufferedReader(f);
        ) {
            int len;
            char[] buffer = new char[1024];
            while((len = fr.read(buffer)) != -1){
                System.out.println(new String(buffer, 0, len));
            }
//            String line;
//            while((line = fr.readLine()) != null){
//                System.out.println(line);//一行一行读
//            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
