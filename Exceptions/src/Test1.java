public class Test1 {
    public static void main(String[] args) {
//        try {
//            age(160);
//            System.out.println("底层执行成功");
//        } catch (Exception e) {
//            System.out.println("底层出现问题");
//            throw new RuntimeException(e);
//        }

        try {
            age1(256);
            System.out.println("年龄没问题");
        } catch (AgeIlegalException e) {
            System.out.println("年龄问题");
            throw new RuntimeException(e);
        }
    }

    public static void age1(int age) throws AgeIlegalException{ //throws抛出方法内部异常
//        if(age > 0 && age < 150) System.out.println("年龄合法" + age);
//        else System.out.println("年龄非法" + age);
        if(age > 0 && age < 150) System.out.println("年龄合法" + age);
        else {
            throw new AgeIlegalException("年龄非法" + age);
        }
    }

    public static void age(int age){
//        if(age > 0 && age < 150) System.out.println("年龄合法" + age);
//        else System.out.println("年龄非法" + age);
        if(age > 0 && age < 150) System.out.println("年龄合法" + age);
        else {
            throw new AgeIlegalRuntimeException("年龄非法" + age);
        }
    }
}



