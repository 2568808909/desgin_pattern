package cn.ccb.pattern.structural.decorator.V2;

public class EggDecorator extends AbsBatterCakeDecorator{

    public EggDecorator(AbsBatterCake absBatterCake) {
        super(absBatterCake);
    }

    @Override
    public String desc() {
        return super.desc()+" 加一个蛋";
    }

    @Override
    public int cost() {
        return super.cost()+1;
    }
}
