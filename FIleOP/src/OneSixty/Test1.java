package OneSixty;

import java.io.*;

public class Test1 {
    public static void main(String[] args) throws Exception {
        try(InputStream is = new FileInputStream("FIleOP/src/OneFiftyNine/111.png");
            OutputStream os = new FileOutputStream("FIleOP/src/OneFiftyEight/222.png");) {

            int len;
            byte[] bytes = new byte[1024];
            while ((len = is.read(bytes)) != -1){
                os.write(bytes, 0, len);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        os.close();//如果出现异常容易不执行这行代码
//        is.close();
    }
}
