package cn.ccb.pattern.behavioral.state;

public class SpeedState extends CourseVideoState{
    @Override
    public void play() {
        super.courseVideoContext.setState(CourseVideoContext.PLAY_STATE);
    }

    @Override
    public void speed() {
        System.out.println("快进播放视频状态...");
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
