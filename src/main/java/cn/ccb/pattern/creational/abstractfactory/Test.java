package cn.ccb.pattern.creational.abstractfactory;

public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory=new PythonCourseFactory();
        courseFactory.getVideo().produce();
        courseFactory.getArticle().produce();
    }
}
