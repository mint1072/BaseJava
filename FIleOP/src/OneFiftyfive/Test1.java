package OneFiftyfive;

import java.io.File;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws Exception {
        //递归遍历文件夹找到文件
        File f = new File("D:\\limengpan\\Desktop\\CODE\\Java");
        searchFile(f, "ty.txt");
    }
    public static void searchFile(File f, String fileName) throws IOException {
        if (f == null || !f.exists() || f.isFile()) return; //传输文件夹不存在或者是文件或者无法访问
        File[] files = f.listFiles();//遍历一级文件夹
        if (files != null && files.length > 0){
            for (File file : files) {
                if (file.isFile() && file.getName().contains(fileName)) {
                    System.out.println("找到文件：" + file.getAbsoluteFile());
//                    Runtime runtime = Runtime.getRuntime();
//                    runtime.exec(file.getAbsolutePath());//应用程序的启动
                }
                else{
                    searchFile(file, fileName);
                }
        }
    }
}}
