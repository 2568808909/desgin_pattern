package cn.ccb.pattern.behavioral.strategy;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Course {

    private PromotionStrategy promotionStrategy;

    public void buyCourse() {
        promotionStrategy.doPromotion();
    }
}
