package cn.ccb.pattern.structural.decorator.V1;

public class BatterCake {

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
