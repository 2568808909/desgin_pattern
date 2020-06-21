package cn.ccb.pattern.behavioral.command;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class OpenCommand implements Command{

    private CourseVideo courseVideo;

    @Override
    public void execute() {
        this.courseVideo.open();
    }
}
