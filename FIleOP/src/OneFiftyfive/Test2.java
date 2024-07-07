package OneFiftyfive;

import java.io.File;

public class Test2 {
    public static void main(String[] args) {
        //删除非空文件夹
        File file = new File("Datesets\\DUO");
        delete(file);
    }

    public static void delete(File f){
        if (f == null || !f.exists()) return;
        if (f.isFile()) {
            f.delete();
        }
        //如果非空文件夹存在 那进行递归访问逐层删除 先访问一级文件夹
        File[] files = f.listFiles();
        for (File file : files) {
            if (file.isFile()){
                file.delete();
            }
            else{
                delete(file);
            }
        }
        f.delete();
    }
}
