package cn.ccb.pattern.structural.birdge;

public class DepositAccount extends SavingAccount implements Account{
    @Override
    public void openAccount() {
        System.out.println("打开定期账号");
    }

    @Override
    public void showAccountType() {
        System.out.println("这时一个定期账号");
    }
}
