package cn.ccb.pattern.behavioral.strategy;

public class FanxianPromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("购买课程返现20");
    }
}
