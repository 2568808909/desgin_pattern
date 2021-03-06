package cn.ccb.pattern.behavioral.templatemethod;

/**
 * 模板方法
 * 定义：定义了一个算法的骨架，并允许子类为一个或多个步骤提供实现。是子类可以在不改变算法结构的情况下，重新定义算法的某些步骤
 * 类型：行为型
 * <p>
 * 使用场景：
 * 1）一次性实现一个算法不变的部分，将可变的行为留给子类来实现
 * 2）各子类中公共行为被提取出来并集中到一个公共的父类当中，避免代码重复
 * <p>
 * 优点：
 * 1）提高复用性
 * 2）提高扩展性
 * 3）符合开闭原则
 * <p>
 * 缺点：
 * 1）类数目的增加
 * 2）增加了系统实现的复杂度
 * 3）继承关系自身缺点，如果父类添加新的抽象方法，所有子类都要修改一遍
 * <p>
 * 扩展 ： 1）钩子方法
 */
public class TemplateMethod {
}
