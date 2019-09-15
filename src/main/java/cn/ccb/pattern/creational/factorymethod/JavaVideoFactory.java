package cn.ccb.pattern.creational.factorymethod;

import cn.ccb.pattern.creational.simplefactory.JavaVideo;
import cn.ccb.pattern.creational.simplefactory.Video;

public class JavaVideoFactory extends VideoFactory{

    public Video getInstance() {
        return new JavaVideo();
    }
}
