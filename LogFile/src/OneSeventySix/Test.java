package OneSeventySix;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class Test {
    public static void main(String[] args) throws Exception, InterruptedException {
        //实现callable接口 重写任务方法

        //创建callable对象
        Callable<Integer> ca = new MyCallabe(10);

        //封装FutureTask对象任务
        FutureTask<Integer> callableFuture = new FutureTask<>(ca);

        //将任务对象封装成Thread对象
        new Thread(callableFuture).start();
        //使用get获取线程执行结果
        System.out.println(callableFuture.get());
    }
}
