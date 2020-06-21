package cn.ccb.pattern.behavioral.mediator;

import java.util.Date;

/**
 * 模拟中介者
 */
public class StudyGroup {

    public static void showMessage(User user, String message) {
        System.out.println(String.format("%s [%s] say: %s", new Date(), user.getName(), message));
    }
}
