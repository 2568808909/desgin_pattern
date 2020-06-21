package cn.ccb.pattern.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Course> courses = new ArrayList<>();
        FreeCourse freeCourse = new FreeCourse();
        freeCourse.setName("Go语言程序设计");
        courses.add(freeCourse);
        CodingCourse codingCourse = new CodingCourse();
        codingCourse.setPrice(299);
        codingCourse.setName("Java设计模式");
        courses.add(codingCourse);
        Visitor visitor = new Visitor();
        for (Course cours : courses) {
            cours.accept(visitor);
        }
    }
}
