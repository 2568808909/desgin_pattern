package cn.ccb.pattern.creational.prototype;

import java.util.Date;

public class Mail implements Cloneable {

    private String address;

    private Date date;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "address='" + address + '\'' +
                ", date=" + date +
                '}' + super.toString();
    }

    /**
     * 若直接调用父类的clone()则为浅克隆，如果想深克隆，就要自己制定字段
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Mail mail = (Mail) super.clone();
        //深克隆所需操作
        mail.date = (Date) date.clone();
        return mail;
    }
}
