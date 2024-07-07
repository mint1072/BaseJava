package OneSixtySeven;

import java.io.*;

public class Test1 {
    public static void main(String[] args) {
        //序列化与反序列化 将对象写入文件和读取文件中对象
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("FIleOP/src/OneSixtySeven/ccc.txt"));
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("FIleOP/src/OneSixtySeven/ccc.txt"));
        ) {
            oos.writeObject(new Student(24, "sjkhdsk", 56.7));
            oos.writeObject(new Student(24, "lili", 78.9));

//            System.out.println(ois.readObject());
//            System.out.println(ois.readObject());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
