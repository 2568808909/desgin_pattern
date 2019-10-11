package cn.ccb.pattern.structural.composite;

public abstract class CourseComponent {

    protected String name;

    public CourseComponent(String name){
        this.name=name;
    }

    protected void add(CourseComponent courseComponent){
        throw new UnsupportedOperationException("不支持新增操作");
    }

    protected void remove(CourseComponent courseComponent){
        throw new UnsupportedOperationException("不支持删除操作");
    }

    protected String getName(){
        throw new UnsupportedOperationException("不支持获取名称操作");
    }

    protected int getCost(){
        throw new UnsupportedOperationException("不支持获取价格操作");
    }

    protected void print(){
        throw new UnsupportedOperationException("不支持打印操作");
    }
}
