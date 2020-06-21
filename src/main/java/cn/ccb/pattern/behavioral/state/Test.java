package cn.ccb.pattern.behavioral.state;

public class Test {

    public static void main(String[] args) {
        CourseVideoContext courseVideoContext=new CourseVideoContext();
        courseVideoContext.setState(new PlayState());
        System.out.println("当前状态："+courseVideoContext.getState().getClass().getSimpleName());

        courseVideoContext.speed();
        System.out.println("当前状态："+courseVideoContext.getState().getClass().getSimpleName());

        courseVideoContext.pause();
        System.out.println("当前状态："+courseVideoContext.getState().getClass().getSimpleName());

        courseVideoContext.stop();
        System.out.println("当前状态："+courseVideoContext.getState().getClass().getSimpleName());

        courseVideoContext.pause();
        System.out.println("当前状态："+courseVideoContext.getState().getClass().getSimpleName());
    }
}
