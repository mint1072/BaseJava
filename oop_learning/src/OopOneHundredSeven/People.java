package OopOneHundredSeven;

public abstract class People {
    public final void write(){ //加final防止模板方法被重写
        System.out.println("\t\t\t\t\t\t111111111");
        writeMain();
        System.out.println("\t\t\t\t\t\t333333333");
    }
    public abstract void writeMain();
}
