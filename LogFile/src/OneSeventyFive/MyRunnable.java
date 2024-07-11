package OneSeventyFive;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("子进程输出:" + i);
        }
    }
}
