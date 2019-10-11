package cn.ccb.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CourseCataLog extends CourseComponent{

    private List<CourseComponent> courseComponents=new ArrayList<>();

    public CourseCataLog(String name) {
        super(name);
    }

    @Override
    protected void add(CourseComponent courseComponent) {
        courseComponent.add(courseComponent);
    }

    @Override
    protected void remove(CourseComponent courseComponent) {
        courseComponent.remove(courseComponent);
    }

    @Override
    protected String getName() {
        return name;
    }

    @Override
    protected void print() {
        courseComponents.forEach(CourseComponent::print);
    }
}
