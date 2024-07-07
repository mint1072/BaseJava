package OneSixtySeven;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test {
    public static void main(String[] args) {
        //数据输入流 数据输出流 按照类型来读取写入数据
        try(DataOutputStream daas = new DataOutputStream(new FileOutputStream("FIleOP/src/OneSixtySeven/aaa.txt"));
            DataInputStream dis = new DataInputStream(new FileInputStream("FIleOP/src/OneSixtySeven/aaa.txt"));
        ) {
            daas.writeBoolean(false);
            daas.writeInt(97);
            daas.writeChar(65);

            System.out.println(dis.readBoolean());
            System.out.println(dis.readInt());
            System.out.println(dis.readChar());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
