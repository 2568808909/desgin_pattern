package cn.ccb.pattern.creational.factorymethod;

import cn.ccb.pattern.creational.simplefactory.PythonVideo;
import cn.ccb.pattern.creational.simplefactory.Video;

public class PythonVideoFactory extends VideoFactory{
    public Video getInstance() {
        return new PythonVideo();
    }
}
