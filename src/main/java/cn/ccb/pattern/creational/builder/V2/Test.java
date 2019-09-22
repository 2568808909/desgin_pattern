package cn.ccb.pattern.creational.builder.V2;

public class Test {
    public static void main(String[] args) {
        Course.CourseBuilder builder=new Course.CourseBuilder();
        Course course=builder.buildCourseName("Java设计模式").buildPpt("Java设计模式PPT").build();
        System.out.println(course);
    }
}
