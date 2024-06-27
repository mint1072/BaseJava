//自定义运行时异常 继承runtimeexception
public class AgeIlegalRuntimeException extends RuntimeException{
    //直接constructor 方法重写
    public AgeIlegalRuntimeException() {
    }

    public AgeIlegalRuntimeException(String message) {
        super(message);
    }
}
