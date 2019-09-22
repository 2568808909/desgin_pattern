package cn.ccb.pattern.structural.adapter.classadapter;

public class Test {
    public static void main(String[] args) {
        DC5V dc5V=new PowerAdapter();
        dc5V.outputDC5V();
    }
}
