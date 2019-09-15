package cn.ccb.pattern.creational.builder;

public class CourseActualBuilder extends CourseBuilder{

    private Course course=new Course();

    @Override
    public void buildCourseNmae(String courseName) {
        this.course.setCourseName(courseName);
    }

    @Override
    public void buildPpt(String ppt) {
        this.course.setPpt(ppt);
    }

    @Override
    public void buildVideo(String video) {
        this.course.setVideo(video);
    }

    @Override
    public void buildArticle(String article) {
        this.course.setArticle(article);
    }

    @Override
    public void buildCourseQA(String courseQA) {
        this.course.setCourseQA(courseQA);
    }

    public Course makeCourse(){
        return course;
    }
}
