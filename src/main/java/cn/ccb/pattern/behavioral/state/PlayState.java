package cn.ccb.pattern.behavioral.state;

public class PlayState extends CourseVideoState{
    @Override
    public void play() {
        System.out.println("正常播放中...");
    }

    @Override
    public void speed() {
        super.courseVideoContext.setState(CourseVideoContext.SPEED_STATE);
    }

    @Override
    public void pause() {
        super.courseVideoContext.setState(CourseVideoContext.PAUSE_STATE);
    }

    @Override
    public void stop() {
        super.courseVideoContext.setState(CourseVideoContext.STOP_STATE);
    }
}
