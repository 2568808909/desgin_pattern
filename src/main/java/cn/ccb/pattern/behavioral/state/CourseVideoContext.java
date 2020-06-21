package cn.ccb.pattern.behavioral.state;

import lombok.Data;

@Data
public class CourseVideoContext {

    private CourseVideoState state;
    public final static PlayState PLAY_STATE = new PlayState();
    public final static PauseState PAUSE_STATE = new PauseState();
    public final static StopState STOP_STATE = new StopState();
    public final static SpeedState SPEED_STATE = new SpeedState();

    public void setState(CourseVideoState state) {
        this.state = state;
        this.state.setCourseVideoContext(this);
    }

    public void play() {
        this.state.play();
    }

    public void speed() {
        state.speed();
    }

    public void pause() {
        state.pause();
    }

    public void stop() {
        state.stop();
    }
}
