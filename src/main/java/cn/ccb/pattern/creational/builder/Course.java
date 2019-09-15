package cn.ccb.pattern.creational.builder;

public class Course {
    private String courseName;
    private String ppt;
    private String video;
    private String article;
    private String courseQA; //question & answer

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

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getPpt() {
        return ppt;
    }

    public void setPpt(String ppt) {
        this.ppt = ppt;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getCourseQA() {
        return courseQA;
    }

    public void setCourseQA(String courseQA) {
        this.courseQA = courseQA;
    }
}
