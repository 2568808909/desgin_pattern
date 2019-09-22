package cn.ccb.pattern.structural.facade;

public class PointCheckService {

    public boolean checkPoint(PointGif gif){
        //校验逻辑
        System.out.println("积分足够，可以兑换"+gif.getName());
        return true;
    }
}
