package OneFiftyTwo;

import java.awt.*;
import java.io.File;

public class FileTest {
    public static void main(String[] args) {
        //创建文件对象指代具体文件
//        File f = new File("D:\\limengpan\\Desktop\\images");
//        File f = new File("D:/limengpan/Desktop/images");
        File f = new File("D:" + File.separator +"limengpan" + File.separator + "Desktop" + File.separator + "images");
        System.out.println(f.length());
        //找模块里的文件 相对路径
        File f1 = new File("SetModules\\itt.txt");
        System.out.println(f1.length());

    }

}
