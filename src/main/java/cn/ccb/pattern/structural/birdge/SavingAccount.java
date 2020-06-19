package cn.ccb.pattern.structural.birdge;

public class SavingAccount implements Account{
    @Override
    public void openAccount() {
        System.out.println("打开储蓄账号");
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个储蓄账号");
    }
}
