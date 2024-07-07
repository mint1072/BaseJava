package OneFiftyNine;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Test {
    public static void main(String[] args) throws Exception {
        //1.文件字节输出流也是创建管道使用方法
//        OutputStream os = new FileOutputStream("FIleOP/src/OneFiftyNine/aaa.txt");//覆盖原文件内容
        OutputStream os = new FileOutputStream("FIleOP/src/OneFiftyNine/aaa.txt", true);//覆盖原文件内容

        os.write(97);
        os.write('b');
        byte[] bytes = "我爱你中国".getBytes();
        os.write(bytes);
        os.write("\r\n".getBytes());//换行
        os.write(bytes, 0,15);
        os.close();
    }
}
