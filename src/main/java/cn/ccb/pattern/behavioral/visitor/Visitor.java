package cn.ccb.pattern.behavioral.visitor;

/**
 * 访问者模式
 * 定义：封装作用于某种数据结构（如：List/Set/Map等）中的各种元素的操作。可以在不改变个元素类的前提下作用于这些元素的操作。
 * 类型：行为型
 * <p>
 * 适用场景：
 * 1）一个数据结构中（如List/Set/Map）包含很多对象
 * 2）数据结构与数据操作分离
 * <p>
 * 优点：
 * 1）增加新的操作很容易，即增加一个新的访问者
 * <p>
 * 缺点：
 * 1)增加新的数据结构比较困难
 * 2)具体元素变更比较麻烦
 */
public class Visitor implements IVisitor {
    @Override
    public void visit(FreeCourse freeCourse) {
        System.out.println("免费课程：" + freeCourse.getName());
    }

    @Override
    public void visit(CodingCourse codingCourse) {
        System.out.println("实战课程: "+codingCourse.getName()+" 价格："+codingCourse.getPrice());
    }
}
