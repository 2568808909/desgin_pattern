package cn.ccb.pattern.creational.simplefactory;

public class Test {
    public static void main(String[] args) {
        /**
         * 这样做的话，video的创建就非常依赖于后面new的对象，我们想要
         * 获取不同的视频对象，都要重新修改代码。
         */
//        Video video =new JavaVideo();
//        System.out.println(video);

        /**
         * 这样使用了简单工厂，我们使用时，只需要往工厂中注入不同的参数，
         * 即可获取到不同的对象
         */
        VideoFactory videoFactory =new VideoFactory();
        Video video= videoFactory.getInstance("java");
        video.produce();

        video= videoFactory.getInstance(PythonVideo.class);
        video.produce();
    }
}
