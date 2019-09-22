package cn.ccb.pattern.structural.decorator.V2;

public class AbsBatterCakeDecorator extends AbsBatterCake {

    private AbsBatterCake absBatterCake;

    public AbsBatterCakeDecorator(AbsBatterCake absBatterCake) {
        this.absBatterCake = absBatterCake;
    }

    @Override
    public String toString() {
        return desc() + cost() + "块钱";
    }

    @Override
    protected String desc() {
        return absBatterCake.desc();
    }

    @Override
    protected int cost() {
        return absBatterCake.cost();
    }
}
