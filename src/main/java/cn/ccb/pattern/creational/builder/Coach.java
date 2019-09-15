package cn.ccb.pattern.creational.builder;


public class Coach {
    private CourseBuilder courseBuilder;

    public void setCourseBuilder(CourseBuilder courseBuilder){
        this.courseBuilder=courseBuilder;
    }

    public Course makeCourse(String courseName,String ppt,String video,String article,String courseQA){
        this.courseBuilder.buildCourseNmae(courseName);
        this.courseBuilder.buildPpt(ppt);
        this.courseBuilder.buildVideo(video);
        this.courseBuilder.buildArticle(article);
        this.courseBuilder.buildCourseQA(courseQA);
        return this.courseBuilder.makeCourse();
    }
}
