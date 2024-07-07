package OneFiftyEight;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Test {
    public static void main(String[] args) throws Exception {
        //1. 创建文件管道
        InputStream is = new FileInputStream("FIleOP/src/OneFiftyEight/io.txt");
        byte[] b = new byte[3];
        int len;//每次都装多少字节数据 读取中文还会出现乱码情况 如果一次性读三个字节 但是有一个英文和中文 读取超过三个字节
//        int len = is.read(b);//每次最多读n个字节到字节数组里 读取完毕返回-1
//        String s = new String(b);
//        System.out.println(s);
//
//        int len1 = is.read(b);
//        String s1 = new String(b, 0, len1);//从哪个位置开始倒 倒多少长度的
//        System.out.println(s1);
        while ((len = is.read(b)) != -1){
            System.out.print(new String(b, 0, len));
        }
    }
}
