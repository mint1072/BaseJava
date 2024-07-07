package OneSixtyTwo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Test2 {
    public static void main(String[] args) {

        try(Writer f = new FileWriter("FIleOP/src/OneSixtyOne/bbbb.txt");
            BufferedWriter fw = new BufferedWriter(f);
        ) {
            fw.write("爱你");
            fw.newLine();
            fw.write("aaa");
            fw.newLine();
            fw.write("abbb");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
