package cn.ccb.pattern.structural.facade;

public class StoreCheckService {

    public boolean checkStore(PointGif gif){
        //检查库存
        System.out.println(gif.getName()+"库存充足");
        return true;
    }
}
