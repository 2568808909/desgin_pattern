package cn.ccb.pattern.creational.factorymethod;

import cn.ccb.pattern.creational.simplefactory.Video;

import java.util.Collection;

/**
 * 定义：定义一个创建对象的接口，但让实现这个接口的类决定实例化那个类，工厂方法让类的实例化推迟到子类中进行
 * 类型：创建型
 *
 *  使用场景：
 *  1.创建对象需要大量重复的代码
 *  2.客户端(应用层)不依赖于产品类型如何别创建，实现等细节
 *  3.一个类通过其子类来指定创建那个对象
 *
 *  优点：
 *  1.用户只需要关心产品对应的工厂，无需关心创建细节
 *  2.加入新产品符合开闭原则，提高可扩展性
 *
 *  缺点：
 *  1.类的个数容易过多，增加复杂度
 *  2.增加了系统的抽象性和理解难度
 *
 *  工厂方法在源码中的体现：
 *  {@link Collection#iterator()} 是一个抽象工厂
 */
public abstract class VideoFactory {

    /**
     * 如果有新的实例需要床架，我们只需要创建对应的子类，实现这个方法即可，扩展性比简单工厂要好
     * @return
     */
    public abstract Video getInstance();

}
