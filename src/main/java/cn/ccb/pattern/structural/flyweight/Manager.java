package cn.ccb.pattern.structural.flyweight;

import lombok.Setter;

public class Manager implements Employee {

    private String department;

    @Setter
    private String reportContent;

    public Manager(String department) {
        this.department = department;
    }

    public void report() {
        System.out.println(department + "部门经理汇报: " + reportContent);
    }
}
