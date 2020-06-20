package cn.ccb.pattern.behavioral.iterator;

import java.util.Iterator;

public class Course extends CourseComponent {

    private int cost;

    public Course(String name) {
        this(name, 0);
    }

    public Course(String name, int cost) {
        super(name);
        this.cost = cost;
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
        System.out.println(name + " " + cost);
    }

    @Override
    public Iterator<CourseComponent> iterator() {
        return new CourseIterator();
    }
}

class CourseIterator implements Iterator<CourseComponent> {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Course next() {
        return null;
    }
}
