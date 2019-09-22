package cn.ccb.pattern.structural.facade;

public class Test {

    public static void main(String[] args) {
        PointGif pointGif=new PointGif();
        pointGif.setName("扫地机器人");
        GifService gifService=new GifService();
        long orderId=gifService.getGif(pointGif);
        System.out.println("兑换成功，物流订单号为:" +orderId);
    }
}
