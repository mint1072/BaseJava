package ExtendsOneHundredTwo;

public class Z extends F{
    String name = "子类名称";
    public void showName(){
        name = "局部名称";
        System.out.println(super.name);
    }
}
