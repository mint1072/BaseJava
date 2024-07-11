package OneSeventySix;

public class Test1 {
    public static void main(String[] args) throws Exception {
        Thread thread1 = new MyThread("1号线程");//设置名称第二种方法 使用构造器
//        thread1.setName("1号线程");//设置名称第一种方法 使用setName()

        thread1.start();
        System.out.println(thread1.getName());

        Thread thread2 = new MyThread("2号线程");
//        thread2.setName("2号线程");
        thread2.start();
        System.out.println(thread2.getName());
        thread2.join();//强制性让thread2先跑完


        Thread thread = Thread.currentThread();//当前执行线程对象
        thread.setName("主线程");
        System.out.println(thread.getName());
        thread.join();


        for (int i = 0; i < 5; i++) {
            System.out.println(thread.getName() + "输出" + i);
        }
    }
}
