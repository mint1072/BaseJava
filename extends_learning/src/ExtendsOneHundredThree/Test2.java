package ExtendsOneHundredThree;


class People{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public People() {
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Teacher extends People{
    private String skill;

    public Teacher(String name, int age, String skill){
        super(name, age);
        this.skill = skill;

    }
    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}
public class Test2 {
    public static void main(String[] args) {
        Teacher t = new Teacher("博涅", 24, "翘足");
        System.out.println(t.getName());
        System.out.println(t.getAge());
        System.out.println(t.getSkill());
    }
}
