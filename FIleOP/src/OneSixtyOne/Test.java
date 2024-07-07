package OneSixtyOne;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Test {
    public static void main(String[] args) {
        //创建文件字符输入流管道
        try(Reader fr = new FileReader("FIleOP/src/OneSixtyOne/aaa.txt");) {
//            int len;
//            while((len = fr.read()) != -1){//每次都只读一个字符 效率低 使用字符数组形式
//                System.out.print((char)len);
//            }

            //使用字符数组形式
            int len;
            char[] buffer = new char[3];
            while ((len = fr.read(buffer)) != -1) {
                System.out.print(new String(buffer));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
