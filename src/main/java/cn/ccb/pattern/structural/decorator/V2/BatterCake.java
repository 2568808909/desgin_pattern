package cn.ccb.pattern.structural.decorator.V2;

public class BatterCake extends AbsBatterCake{

    public String desc(){
        return "煎饼";
    }

    public int cost(){
        return 8;
    }

    @Override
    public String toString() {
        return desc() + cost()+"块钱";
    }
}
