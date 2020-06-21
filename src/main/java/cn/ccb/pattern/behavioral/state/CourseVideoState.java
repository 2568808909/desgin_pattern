package cn.ccb.pattern.behavioral.state;

import lombok.Setter;

public abstract class CourseVideoState {

    @Setter
    protected CourseVideoContext courseVideoContext;

    public abstract void play();
    public abstract void speed();
    public abstract void pause();
    public abstract void stop();
}
