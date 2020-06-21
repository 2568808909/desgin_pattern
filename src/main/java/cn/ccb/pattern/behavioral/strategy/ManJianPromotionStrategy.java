package cn.ccb.pattern.behavioral.strategy;

public class ManJianPromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("购买课程满200-20");
    }
}
