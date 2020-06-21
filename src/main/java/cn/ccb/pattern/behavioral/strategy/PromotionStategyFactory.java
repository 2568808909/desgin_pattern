package cn.ccb.pattern.behavioral.strategy;

import java.util.HashMap;
import java.util.Map;

public class PromotionStategyFactory {

    private final static Map<String, PromotionStrategy> STRATEGY_MAP = new HashMap<>();
    private final static EmptyPromotionStrategy NON_PROMOTION = new EmptyPromotionStrategy();


    static {
        STRATEGY_MAP.put(StategyStr.MANJIAN, new ManJianPromotionStrategy());
        STRATEGY_MAP.put(StategyStr.LIJIAN, new LiJianPromotionStrategy());
        STRATEGY_MAP.put(StategyStr.FANXIAN, new FanxianPromotionStrategy());
    }

    public static PromotionStrategy getStategy(String strategy) {
        return STRATEGY_MAP.getOrDefault(strategy, NON_PROMOTION);
    }

    //将常量卸载接口中是为了更好的对常量做区分
    interface StategyStr {
        String MANJIAN = "MANJIAN";
        String LIJIAN = "LIJIAN";
        String FANXIAN = "FANXIAN";
    }
}
