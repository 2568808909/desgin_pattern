package cn.ccb.pattern.structural.adapter.objectadapter;

public class PowerAdapter implements DC5V {

    private AC220 ac220=new AC220();

    @Override
    public int outputDC5V() {
        int input=ac220.outputAC220V();
        int output=input/44;
        System.out.println("输入"+input+"V交流电，输出"+output+"V");
        return output;
    }
}
