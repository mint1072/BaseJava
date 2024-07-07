package OneSixtyOne;

import java.io.FileWriter;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) {
        try( FileWriter fw = new FileWriter("FIleOP/src/OneSixtyOne/bbbb.txt", true);) {
           //1. public void write(int ):写一个字符进去 字符并不是字节 不指定字节数
            fw.write(97);
            fw.write('a');
            fw.write('爱');
            fw.write("\r\n");


            //2. public void write(String str)
            fw.write("我爱你中国abc");
            fw.write("\r\n");

            //3. public void write(String str, int pos, int len)
            fw.write("我爱你中国abc", 0, 5);
            fw.write("\r\n");

            //4. public void write(char[] buffer)
            char[] buffer = {'黑', '马', '2', 'a', 'e'};
            fw.write(buffer);
            fw.write("\r\n");

            //5. public void write(char[] buffer, int pos, int len)
            fw.write(buffer, 0, 3);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
