package cn.ccb.pattern.structural.decorator.V1;

import cn.ccb.pattern.structural.decorator.V2.BatterCake;

/**
 * 如此做，的确可以不改变BatterCake类代码的基础上进行扩展，但是并不是很灵活，如果此时
 * 有一个需求，我要煎饼加一个单一根肠，或者两个蛋，对于这些排列组合，我们都要一一去写
 * 一个子类去继承势必会造成类的爆炸，这也是不现实的，所以，此时我们可以使用装饰者模式。
 */
public class Test {

    public static void main(String[] args) {
        BatterCake batterCake=new BatterCake();
        System.out.println(batterCake);

        batterCake=new BatterCakeWithEgg();
        System.out.println(batterCake);

        batterCake=new BatterCakeWithSausage();
        System.out.println(batterCake);
    }
}
