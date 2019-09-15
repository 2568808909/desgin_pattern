package cn.ccb.pattern.creational.builder;

public abstract class CourseBuilder {

    public abstract void buildCourseNmae(String courseName);
    public abstract void buildPpt(String ppt);
    public abstract void buildVideo(String video);
    public abstract void buildArticle(String article);
    public abstract void buildCourseQA(String courseQA);
    public abstract Course makeCourse();
}
