package OneFiftyThree;

import java.io.File;

public class Test2 {
    public static void main(String[] args) {
        //两个遍历文件夹方法
        File f1 = new File("D:\\limengpan\\Desktop\\CODE\\Java");
        //1.public String[] list():获取当前目录下所有一级文件名称到一个字符串数组中返回
        String[] files1 = f1.list();
//        System.out.println(files1);
        for (String s : files1) {
            System.out.println(s);
        }

        //2. public File[] ListFiles():获取当前目录下所有一级文件对象到一个文件对象数组中返回
        File[] f2 = f1.listFiles();
        for (File file : f2) {
            System.out.println(file.getName());
        }

    }
}
