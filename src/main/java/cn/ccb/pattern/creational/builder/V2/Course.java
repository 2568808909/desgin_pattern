package cn.ccb.pattern.creational.builder.V2;

public class Course {
    private String courseName;
    private String ppt;
    private String video;
    private String article;
    private String courseQA; //question & answer

    private Course(CourseBuilder courseBuilder){
        this.courseName=courseBuilder.courseName;
        this.ppt=courseBuilder.ppt;
        this.video=courseBuilder.video;
        this.article=courseBuilder.article;
        this.courseQA=courseBuilder.courseQA;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", ppt='" + ppt + '\'' +
                ", video='" + video + '\'' +
                ", article='" + article + '\'' +
                ", courseQA='" + courseQA + '\'' +
                '}';
    }

    static class CourseBuilder{
        private String courseName;
        private String ppt;
        private String video;
        private String article;
        private String courseQA;

        public CourseBuilder buildCourseName(String courseName) {
            this.courseName=courseName;
            return this;
        }

        public CourseBuilder buildPpt(String ppt) {
            this.ppt=ppt;
            return this;
        }

        public CourseBuilder buildVideo(String video) {
            this.video=video;
            return this;
        }

        public CourseBuilder buildArticle(String article) {
            this.article=article;
            return this;
        }

        public CourseBuilder buildCourseQA(String courseQA) {
            this.courseQA=courseQA;
            return this;
        }

        public Course build(){
            return new Course(this);
        }
    }
}
