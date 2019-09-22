package cn.ccb.pattern.creational.prototype;

import java.util.Date;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mailTemp=new Mail();
        mailTemp.setAddress("地址模板");
        mailTemp.setDate(new Date(0));
        System.out.println(mailTemp);
        for(int i=0;i<10;i++){
            Mail mail= (Mail) mailTemp.clone();
            mail.setAddress(i+"同学");
            mail.setDate(new Date());
            System.out.println(mail);
        }
    }

}
