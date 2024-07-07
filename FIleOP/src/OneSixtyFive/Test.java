package OneSixtyFive;

import java.io.*;

public class Test {
    public static void main(String[] args) {
        //字符输入转换流用来解决不同编码时 字符流读取文本内容乱码问题 字符流不能指定编码格式 只能使用原始字节输入流按照指定编码格式转换成字符输入流
        try( InputStream fi = new FileInputStream("FIleOP/src/OneSixtyFive/aa.txt");
             Reader ir = new InputStreamReader(fi, "GBK"); //将原始字节流以特定编码转换成字符流
             BufferedReader br = new BufferedReader(ir);) {
            String string;
            while((string = br.readLine()) != null){
                System.out.println(string);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
