package OneFiftyEight;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Test1 {
    public static void main(String[] args) throws Exception {
        //一次性读取完文件全部字节到一个字节数组中去 会避免乱码 但是内存会出现不够情况
        InputStream is = new FileInputStream("FIleOP/src/OneFiftyEight/io.txt");
//        File file = new File("FIleOP/src/OneFiftyEight/io.txt");
//        long length = file.length();
//        byte[] b = new byte[(int)length];
//        int len = is.read(b);
//        System.out.println(new String(b));
//        System.out.println(len);
//        System.out.println(length);

        byte[] bytes = is.readAllBytes();
        System.out.println(new String(bytes));

        is.close();
    }
}
