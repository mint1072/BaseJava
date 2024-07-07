package OneFiftySix;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws Exception {
        String str = "a我b";
        //内部字符编码解码函数
        byte[] bytes = str.getBytes();//编码 使用默认编码符 UTF-8 中文三个字节 英文一个字节
        System.out.println(Arrays.toString(bytes));

        byte[] bytes1 = str.getBytes("GBK");//指定编码集
        System.out.println(Arrays.toString(bytes1));

        String s = new String(bytes);//默认解码
        System.out.println(s);

        String s1 = new String(bytes1, "GBK");
        System.out.println(s1);

    }
}
