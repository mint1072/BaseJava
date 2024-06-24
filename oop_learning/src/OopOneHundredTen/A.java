package OopOneHundredTen;

public interface A {
    public default void test1(){ //可不写public 默认为public 新增的默认方法
        System.out.println("默认方法");
//        test2();
    }
    private void test2(){ //新增私有方法 使用实现类访问

    }
    public static void test3(){
        System.out.println("静态方法"); //默认public 新增静态方法
    }
}
