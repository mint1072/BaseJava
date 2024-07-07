package OneFiftySeven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Test1 {
    public static void main(String[] args) throws Exception {
        //1. 文件字节输入流 读取性能差 遇到中文乱码 因为每次都只读一个字节
        InputStream is = new FileInputStream("FIleOP/src/OneFiftySeven/it01.txt");//创建与文件连接的管道
//        System.out.println(is.read());
//        System.out.println(is.read());
//        System.out.println(is.read());//每次读一个字节返回 没有数据就-1返回
        int b;
        while ((b = is.read()) != -1){
            System.out.print((char)b);
        }
        is.close();
    }

}
