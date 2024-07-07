package OneSixtyFive;

import java.io.*;

public class Test1 {
    public static void main(String[] args) {
        //字符输出转换流控制写出去字符编码格式 OutStreamWriter
        //1.可使用字节数组将读取到的字符串使用getBytes方法转换成指定格式的字节数组再封装成字符流

        //2.直接使用字符输出转换流
        try(OutputStream os = new FileOutputStream("FIleOP/src/OneSixtyFive/bb.txt");
            Writer osw = new OutputStreamWriter(os, "GBK");
            BufferedWriter bfw = new BufferedWriter(osw);) {
            bfw.write("aklfjk");
            bfw.write("我爱你中国");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
