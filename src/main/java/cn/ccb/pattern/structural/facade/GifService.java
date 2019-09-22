package cn.ccb.pattern.structural.facade;

public class GifService {

    private PointCheckService pointCheckService=new PointCheckService();

    private StoreCheckService storeCheckService=new StoreCheckService();

    private ShippingService shippingService=new ShippingService();

    public long getGif(PointGif pointGif){
        if(pointCheckService.checkPoint(pointGif)){
            if(storeCheckService.checkStore(pointGif)){
                return shippingService.createShipping(pointGif);
            }
        }
        return 0L;
    }
}
