package cn.ccb.pattern.structural.decorator.V2;

public class SausageDecorator extends AbsBatterCakeDecorator{
    public SausageDecorator(AbsBatterCake absBatterCake) {
        super(absBatterCake);
    }

    @Override
    public String desc() {
        return super.desc()+" 加一根肠";
    }

    @Override
    public int cost() {
        return super.cost()+2;
    }
}
