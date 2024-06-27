import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test2 {
    public static void main(String[] args) {
        try {
            test1();
        } catch (FileNotFoundException e) {
            System.out.println("文件找不到");
            throw new RuntimeException(e);
        } catch (ParseException e) {
            System.out.println("解析问题");
            throw new RuntimeException(e);
        }
    }

    public static void test1() throws FileNotFoundException, ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = sdf.parse("2011-22-22 10:24:34");
        System.out.println(d);

        test2();
    }

    public static void test2() throws FileNotFoundException {
        InputStream is = new FileInputStream("D:/meinv.png");

    }
}
