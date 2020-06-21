package cn.ccb.pattern.behavioral.strategy;

public class Test {

//    public static void main(String[] args) {
//        Course course = new Course(new FanxianPromotionStrategy());
//        course.buyCourse();
//        course=new Course(new ManJianPromotionStrategy());
//        course.buyCourse();
//        course=new Course(new LiJianPromotionStrategy());
//        course.buyCourse();
//    }


    /**
     * 结合工厂和享元模式
     */
    public static void main(String[] args) {
        Course course = new Course(PromotionStategyFactory.getStategy("FANXIAN"));
        course.buyCourse();
    }
}
