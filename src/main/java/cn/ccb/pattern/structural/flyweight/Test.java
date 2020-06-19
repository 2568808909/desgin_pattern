package cn.ccb.pattern.structural.flyweight;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        String[] departments = {"RD", "BQ", "QA", "PM"};
        Random random=new Random();
        for (int i = 0; i < 10; i++) {
            int index = random.nextInt(departments.length);
            Manager manager = EmployeeFactory.getManager(departments[index]);
            manager.report();
        }
    }
}
