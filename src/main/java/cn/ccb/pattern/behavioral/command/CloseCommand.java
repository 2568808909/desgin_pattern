package cn.ccb.pattern.behavioral.command;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CloseCommand implements Command{

    private CourseVideo courseVideo;

    @Override
    public void execute() {
        courseVideo.close();
    }
}
