package cn.ccb.pattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CourseCataLog extends CourseComponent {

    private List<CourseComponent> courseComponents = new ArrayList<>();

    public CourseCataLog(String name) {
        super(name);
        this.level = 0;
    }

    @Override
    protected void add(CourseComponent courseComponent) {
        courseComponents.add(courseComponent);
        courseComponent.setLevel(this.level + 1);
        if (courseComponent instanceof CourseCataLog) {
            ((CourseCataLog) courseComponent).resetLevel();
        }
    }

    private void resetLevel() {
        courseComponents.forEach(courseComponent -> courseComponent.setLevel(this.level + 1));
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
        System.out.println(this.name + ":");
        courseComponents.forEach(courseComponent -> {
            for (int i = 0; i < courseComponent.level; i++)
                System.out.print("\t");
            courseComponent.print();
        });
    }

    @Override
    public Iterator<CourseComponent> iterator() {
        return new CourseCataLogIterator();
    }

    class CourseCataLogIterator implements Iterator<CourseComponent> {

        private int pos = 0;
        private int size = courseComponents.size();

        @Override
        public boolean hasNext() {
            return pos < size;
        }

        @Override
        public CourseComponent next() {
            return courseComponents.get(pos++);
        }
    }
}

