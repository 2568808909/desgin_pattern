package cn.ccb.pattern.behavioral.mediator;

/**
 * User模拟客户端
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        //此处只是模拟通过学习群发送消息
        StudyGroup.showMessage(this, message);
    }
}
