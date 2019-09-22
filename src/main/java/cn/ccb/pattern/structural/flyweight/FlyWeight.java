package cn.ccb.pattern.structural.flyweight;

/**
 * 享元模式
 * 定义：提供减少对象数量从而改善应用所需的对象结构的方式，运用共享技术有效地支持大量细粒度的对象
 * 类型：结构型
 *
 * 适用场景：
 * 1.常常应用于系统底层的开发，以便解决系统的性能问题
 * 2.系统中有大量相似对象，需要缓冲池的场景
 *
 * 优点：
 * 1.减少对象的创建，降低内存中对象的数量，降低系统的内存，提高效率
 * 2.减少内存之外的其他资源的占用(如时间，通过享元模式共享对象可以减少对象创建过程所需时间)
 *
 * 缺点：
 * 1.关注内/外状态、关注线程安全问题
 * 2.是系统、程序的逻辑复杂化。
 *
 * 扩展：
 * 内部状态：在享元对象的内部，并且不会随着环境改变而改变的状态（如属性）
 * 外部状态：不可共享的状态，记录在享元对象的外部，会随环境变化
 *
 * 相关的设计模式：
 * 1.享元模式和代理模式：若使用代理模式生成一个代理类时，所需时间和资源都比较多，此时可以使用享元模式提高系统处理速度
 * 2.享元模式和单例模式：如容器单例模式，就是享元模式与单例模式的一种结合的产物
 *
 *
 *
 */
public class FlyWeight {
}
