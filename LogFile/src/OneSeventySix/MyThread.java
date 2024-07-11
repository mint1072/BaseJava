package OneSeventySix;

public class MyThread extends Thread{
//    private int sum = 0;

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        for (int i = 0; i < 3; i++) {
            System.out.println(thread.getName() + "子线程输出" + i);
        }
    }
}
