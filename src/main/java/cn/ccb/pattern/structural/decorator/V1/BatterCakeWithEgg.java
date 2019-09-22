package cn.ccb.pattern.structural.decorator.V1;

import cn.ccb.pattern.structural.decorator.V2.BatterCake;

public class BatterCakeWithEgg extends BatterCake {

    @Override
    public String desc() {
        return super.desc()+" 加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost()+1;
    }
}
