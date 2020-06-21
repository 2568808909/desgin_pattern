package cn.ccb.pattern.behavioral.mediator;

public class Test {

    public static void main(String[] args) {
        User jack=new User("Jack");
        User tom = new User("Tom");
        jack.sendMessage("Hey Tom, let`s learn design pattern");
        tom.sendMessage("ok!!");
    }
}
