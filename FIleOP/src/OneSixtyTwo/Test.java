package OneSixtyTwo;

import java.io.*;

public class Test {
    public static void main(String[] args) throws Exception {
        try(InputStream is = new FileInputStream("FIleOP/src/OneFiftyNine/111.png");
            InputStream ins = new BufferedInputStream(is);
//            InputStream ins = new BufferedInputStream(is, 8192 * 2);//自己指定缓冲池多大
            OutputStream os = new FileOutputStream("FIleOP/src/OneFiftyEight/222.png");
            OutputStream ios = new BufferedOutputStream(os);) {

            int len;
            byte[] bytes = new byte[1024];
            while ((len = ins.read(bytes)) != -1){
                ios.write(bytes, 0, len);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        os.close();//如果出现异常容易不执行这行代码
//        is.close();
    }
}
