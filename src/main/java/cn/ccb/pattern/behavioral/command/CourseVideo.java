package cn.ccb.pattern.behavioral.command;

public class CourseVideo {
    private String name;

    public CourseVideo(String name) {
        this.name = name;
    }

    public void open() {
        System.out.println(this.name + "课程开启....");
    }

    public void close() {
        System.out.println(this.name + "课程关闭....");
    }
}
