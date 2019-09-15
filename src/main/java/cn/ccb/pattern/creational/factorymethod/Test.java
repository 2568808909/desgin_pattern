package cn.ccb.pattern.creational.factorymethod;

public class Test {
    public static void main(String[] args) {
        /**
         * 在客户端我们只需要关心那个工厂可以提供那个对象即可
         */
        VideoFactory factory=new JavaVideoFactory();
        factory.getInstance().produce();

        factory=new PythonVideoFactory();
        factory.getInstance().produce();
    }
}
