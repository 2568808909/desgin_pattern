package cn.ccb.pattern.structural.decorator;

/**
 * 装饰者模式
 * 定义：在不改变原有对象的基础上，将功能附加到对象之上，提供了比继承更具有弹性的替代方案(扩展原有对象功能)
 * 类型：结构型
 *
 * 适用场景：
 * 1.扩展一个类的功能或者给已给类添加附加职责
 * 2.动态的给一个对象添加功能，这些功能可以再动态的撤销
 *
 * 优点：
 * 1.继承的有力补充，比继承灵活，在不改变原有对象的情况下给一个对象扩展功能(若扩展的功能过于复杂，
 * 我们使用继承去扩展要生成很多的子类，从而增加系统的复杂性，而且使用继承扩展功能时，我们必须要
 * 可预见这些扩展功能，因为这些功能在编译时就确定了，是静态的，而若使用装饰者模式，这些功能时由应
 * 用层代码来动态的决定加入的方式及时间)
 * 2.通过使用不同装饰类，以及这些类的排列组合，可以实现不同的效果。
 * 3.符合开闭原则
 *
 *缺点：
 * 1.会出现更多的代码，更多的类，增加程序的复杂性
 * 2.动态装饰时，多层装饰时会更加复杂
 *
 * 相关设计模式：
 * 1.装饰者模式和代理模式：装饰者模式是动态的为对象添加方法，而代理模式关注控制对对象的访问。
 * 2.装饰者模式和适配器模式：装饰者和被装饰者可以实现相同的接口，或者装饰者是被装饰者的子类。
 * 适配器和被适配的类具有不同的接口，也有可能有部分接口重合。
 */
public class Decorator {
}
