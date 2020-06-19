package cn.ccb.pattern.structural.composite;

public class Course extends CourseComponent{

    private int cost;

    public Course(String name) {
        this(name,0);
    }

    public Course(String name,int cost){
        super(name);
        this.cost=cost;
    }

    @Override
    protected String getName() {
        return name;
    }

    @Override
    protected int getCost() {
        return cost;
    }

    @Override
    protected void print() {
        System.out.println(name +" "+cost);
    }
}
