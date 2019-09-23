package cn.ccb.pattern.structural.flyweight;

class Task implements Runnable{
    private static final String[] DEPARTMENT={"AQ","PD","BD","SD"};
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            Manager manager= (Manager) EmployeeFactory.getManager(DEPARTMENT[((int)(Math.random()*4))]);
            manager.report();
        }
    }
}
public class Test {


    public static void main(String[] args) {
        Thread thread=new Thread(new Task());
        Thread thread1=new Thread(new Task());
        Thread thread2=new Thread(new Task());
        thread.start();
        thread1.start();
        thread2.start();
        System.out.println("over");
    }
}
