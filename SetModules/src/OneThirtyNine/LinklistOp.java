package OneThirtyNine;

import java.util.LinkedList;

public class LinklistOp {
    public static void main(String[] args) {
        //1.public void addFirst():在列表开头插入指定元素
        //2.public void addLast():在列表末尾插入指定元素
        //3.public E getFirst():返回列表第一个元素
        //4.public E getLast():返回列表最后一个元素
        //5.public E removeFirst():删除并返回列表第一个元素
        //6.public E removeLast():删除并返回列表最后一个元素
        //应用场景之一是队列 针对收尾操作 先进先出
//        LinkedList<String> queue = new LinkedList<>();
//        queue.addLast("123");
//        queue.addLast("124");
//        queue.addLast("125");
//        queue.addLast("126");
//        System.out.println(queue);
//        System.out.println(queue.removeFirst());
//        System.out.println(queue.removeFirst());
//        System.out.println(queue.removeFirst());
//        System.out.println(queue);

        //应用场景之二是栈 后进先出 先进后出
        LinkedList<String> stack = new LinkedList<>();
        stack.push("java1");
//        stack.addFirst("java1");
        stack.push("java2");
//        stack.addFirst("java2");
        stack.push("java3");
//        stack.addFirst("java3");
        System.out.println(stack);
        System.out.println(stack.pop());
//        System.out.println(stack.removeFirst());
        System.out.println(stack);
    }
}
