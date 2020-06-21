package cn.ccb.pattern.behavioral.strategy;

public class LiJianPromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("购买课程立减20");
    }
}
