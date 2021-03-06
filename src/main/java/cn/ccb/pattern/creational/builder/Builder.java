package cn.ccb.pattern.creational.builder;

/**
 *定义：讲一个复杂的对象构建与他的表示分离，使得同样的构建过程可以创建不同的表示。
 *特点：用户只需要指定需要建造的类型就可以得到他们，建造过程及细节不需要知道。
 * 类型：创建型
 *
 * 适用场景：
 * 1.流程固定，但是顺序不一定固定的
 * 2.如果一个对象拥有非常复杂的内部结构(很多属性)
 * 3.想把复杂的对象创建和使用分离
 *
 *优点：
 * 1.封装性好，创建和使用分离
 * 2.扩展性好。建造类之间的独立，一定程度上解耦
 *
 * 缺点：
 * 1.产生多余的Builder对象
 * 2.产品内部发生变化，建造者都要修改，成本较大
 *
 *建造者模式与工厂模式的区别：
 * 1.建造者更加注重创建对象时方法的调用顺序，工厂更注重于创建产品。
 * 2.创建产品的粒度不同。建造者可以创建更加复杂的产品，由很多不同的部件组成，而工厂创建出来的产品都是一模一样的。
 * 3.工厂模式只需要创建好产品即可，建造者出来创建产品外，还需要知道这个产品是由那些部件组成的。
 * 4.建造者模式比较适用于一定的顺序决定产出的产品不一样的场景。
 *
 *
 */
public class Builder {

}
