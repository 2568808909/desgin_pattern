package cn.ccb.pattern.creational.singleton;

class Task implements Runnable{

    @Override
    public void run() {
        LazySingleton lazySingleton=LazySingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+lazySingleton);
    }
}
public class Test {


    public static void main(String[] args) {
        Thread t1=new Thread(new Task());
        Thread t2=new Thread(new Task());
        t1.start();
        t2.start();
        System.out.println("program end");
    }
}
