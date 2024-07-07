package OneFiftyThree;

import java.io.File;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        //创建文件和删除文件方法

        //1. public boolean createNewFile():创建一个内容为空的新文件 创建成功返回True
        File f1 = new File("D:\\limengpan\\Desktop\\CODE\\Java\\SetModules\\ty.txt");
        System.out.println(f1.createNewFile());
        //2. public boolean mkdir():用于创建文件夹 只能创建一级文件夹
        File f2 = new File("D:\\limengpan\\Desktop\\CODE\\Java\\test");
        System.out.println(f2.mkdir());
        //3. public boolean mkdirs():用于创建多级文件夹
        File f3 = new File("D:\\limengpan\\Desktop\\CODE\\Java\\AA\\BB\\CC");
        System.out.println(f3.mkdirs());
        //4. public boolean delete():删除文件或者空文件 不能删除非空文件
//        File f4 = new File("D:\\limengpan\\Desktop\\CODE\\Java");
//        System.out.println(f4.delete());//不能删除非空的
//         tem.out.println(f4.delete());//针对具有多级文件夹的目录 使用层层删除耗时间 可以使用递归删除


    }
}
