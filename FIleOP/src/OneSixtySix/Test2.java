package OneSixtySix;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class Test2 {
    public static void main(String[] args) {
        //打印流重定向 可指定输出位置
        try(PrintStream pw = new PrintStream("FIleOP/src/OneSixtySix/aaa.txt");) {
            System.setOut(pw);
            System.out.println("skjsk");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
