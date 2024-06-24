package OneHundredFour;

public enum A {
    //枚举类第一行罗列枚举对象名字 枚举构造器是私有的
    X, Y, Z;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
