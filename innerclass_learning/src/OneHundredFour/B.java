package OneHundredFour;

public enum B {//抽象枚举
    X(){ //抽象类不能创建对象 但只要重写方法 让它不成为抽象类就好 这个相当于匿名内部类
        @Override
        public void go(){
            System.out.println("tooto");
        }
    }, Y("张三"){
        @Override
        public void go(){
            System.out.println("toototoot");
            System.out.println(getName() + "再跑");
        }
    };
    public abstract void go();
    private String name;

    B(String name) {
        this.name = name;
    }

    B() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
