package cn.ccb.pattern.structural.decorator.V2;

public class Test {

    public static void main(String[] args) {
        AbsBatterCake absBatterCake=new BatterCake();
        absBatterCake=new EggDecorator(absBatterCake);
        absBatterCake=new SausageDecorator(absBatterCake);
        absBatterCake=new SausageDecorator(absBatterCake);
        System.out.println(absBatterCake);
    }
}
