package cn.ccb.pattern.behavioral.command;

/**
 * 命令模式
 * 定义：将“请求”封装成对象，以便使用不同的请求。该模式解决了应用程序中对象的职责以及它们之间的通信方式。
 * 类型：行为型
 *
 * 适用场景：
 *  1）请求的调用者和请求接受者需要解耦，使得调用者和接收者不直接交互
 *  2）需要抽象出等待执行的行为
 *
 * 优点：
 *  1）降低耦合
 *  2）容易扩展新命令或者一组命令
 *
 * 缺点：
 *  1）命令的无限扩展会增加类的数量，提高系统的复杂度
 */
public interface Command {
    void execute();
}
