package OneSeventyFive;

public class Test {
    public static void main(String[] args) {
//        Runnable myRunnable = new MyRunnable();//1. 单独写一个类
//        new Thread(myRunnable).start();
//        for (int i = 0; i < 5; i++) {
//            System.out.println("主进程:" + i);
//        }

        //2. 使用匿名内部类
        Runnable target = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; ++i) {
                    System.out.println("子进程1" + i);
                }
            }
        };
        new Thread(target).start();
        new Thread(new Runnable() {//简化1
            @Override
            public void run() {
                for (int i = 0; i < 5; ++i) {
                    System.out.println("子进程2" + i);
                }
            }
        }).start();

        new Thread(()->{//简化2
                for (int i = 0; i < 5; ++i) {
                    System.out.println("子进程3" + i);
                }
        }).start();

        for (int i = 0; i < 5; i++) {
            System.out.println("主进程:" + i);



    }
}}
