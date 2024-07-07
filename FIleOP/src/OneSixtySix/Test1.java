package OneSixtySix;

import java.io.*;

public class Test1 {
    public static void main(String[] args) {
        //打印流 打印什么内容就是什么内容 使用write写入相应字符 printStream printWrite
        //1.printStream
        try(PrintStream gf = new PrintStream("FIleOP/src/OneSixtySix/aaa.txt", "GBK");) {
            gf.println(97);
            gf.println("aaa");
            gf.println("dhjs");
            gf.write(97);
            //2.printWrite 与printStream用法一样 但是高级流不能追加只能覆盖 只能封装为低级流
//            PrintWriter printWriter = new PrintWriter(new OutputStream("FIleOP/src/OneSixtySix/aaa.txt", true));)
            {
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }



    }
}
