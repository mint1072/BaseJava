//自定义运行时异常 继承runtimeexception
public class AgeIlegalException extends Exception{
    //直接constructor 方法重写
    public AgeIlegalException() {
    }

    public AgeIlegalException(String message) {
        super(message);
    }
}
