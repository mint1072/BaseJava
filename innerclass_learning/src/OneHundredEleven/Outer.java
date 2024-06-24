package OneHundredEleven;

public class Outer {
    private char sex;
    private double score = 99;
    //成员内部类 地位相当于实例方法
    public class Inner{
        private String name ;
        public static int age;
        private double score = 88;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public static int getAge() {
            return age;
        }

        public static void setAge(int age) {
            Inner.age = age;
        }
        public void test(){
            double score = 66;
            System.out.println(sex); //可以在成员内部类实例方法里访问外部成员
            System.out.println(score);
            System.out.println(this.score);
            System.out.println(Outer.this.score);//访问同名的外部内成员

        }
    }

    public Outer() {
    }

    public Outer(char sex) {
        this.sex = sex;
    }
}
