package cn.ccb.pattern.behavioral.command;

public class Test {

    public static void main(String[] args) {
        Staff staff = new Staff();
        CourseVideo courseVideo = new CourseVideo("Java设计模式");
        staff.addCommand(new OpenCommand(courseVideo));
        staff.addCommand(new CloseCommand(courseVideo));
        staff.executes();
    }
}
