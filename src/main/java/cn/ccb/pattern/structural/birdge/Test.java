package cn.ccb.pattern.structural.birdge;

public class Test {

    public static void main(String[] args) {
        Bank icbcBank = new ICBCBank(new SavingAccount());
        Account account = icbcBank.openAccount();
        account.showAccountType();

        System.out.println();
        icbcBank = new ICBCBank(new DepositAccount());
        account = icbcBank.openAccount();
        account.showAccountType();
    }
}
