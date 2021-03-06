package cn.ccb.pattern.behavioral.state;

/**
 * 状态模式
 * 定义：允许一个对象在其内部状态改变时，改变它的行为
 * 类型：行为型
 *
 * 适用场景：
 *  1）一个对象存在多种状态（不同状态下行为不同），且状态可以互相转换
 *
 * 优点：
 *  1）将不同的状态隔离
 *  2）把各种状态转换逻辑分布到State的子类中，减少相互间依赖
 *  3）增加新的状态非常简单
 *
 * 缺点：
 *  1）状态多的业务导致类的数目增加，系统便复杂
 *
 */
public class State {
}
