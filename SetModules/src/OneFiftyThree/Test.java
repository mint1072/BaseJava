package OneFiftyThree;

import java.io.File;
import java.text.SimpleDateFormat;

public class Test {
    public static void main(String[] args) {
        //创建文件对象 针对文件对象进行方法操作
        File file = new File("D:\\limengpan\\Desktop\\CODE\\Java\\SetModules\\itt.txt");
        //1. public boolean exists():判断当前文件对象对应文件路径是否存在 存在返回True
        System.out.println(file.exists());
        //2. public boolean isFile():判断当前文件对象指代的是否是文件 是文件返回True
        System.out.println(file.isFile());
        //3. public boolean isDirectory():判断指代是否是文件夹 是返回True
        System.out.println(file.isDirectory());
        //4.public String getName():获取文件名称包含后缀
        System.out.println(file.getName());
        //5.public long length():获取文件大小，返回字节个数
        System.out.println(file.length());
        //6.public long lastModified():获取文件最后修改时间
//        System.out.println(file.lastModified());
        long time = file.lastModified();
        SimpleDateFormat sdf = new SimpleDateFormat("yyy/MM/dd HH:mm:ss");
        System.out.println(sdf.format(time));
        //7.public String getPath():获取文件对象路径
        System.out.println(file.getAbsoluteFile());
        //8.public String getAbsolutePath():获取绝对路径
        System.out.println(file.getAbsoluteFile());
    }
}
