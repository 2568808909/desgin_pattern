package cn.ccb.pattern.behavioral.templatemethod;

public class Test {
    public static void main(String[] args) {
        System.out.println("设计模式课程开始---");
        ACourse course=new DesignPatternCourse();
        course.makeCourse();
        System.out.println("设计模式课程结束---");

        System.out.println();
        System.out.println("前端课程开始---");
        course=new FECourse();
        course.makeCourse();
        System.out.println("前端课程结束---");
    }
}
