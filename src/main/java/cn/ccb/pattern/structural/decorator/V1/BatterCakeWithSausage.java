package cn.ccb.pattern.structural.decorator.V1;

import cn.ccb.pattern.structural.decorator.V2.BatterCake;

public class BatterCakeWithSausage extends BatterCake {

    @Override
    public String desc() {
        return super.desc()+" 加一根香肠";
    }

    @Override
    public int cost() {
        return super.cost()+2;
    }
}
