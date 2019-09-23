package cn.ccb.pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class EmployeeFactory {

    private static final Map<String,Employee> EMPLOYEE_MAP=new HashMap<>();

    public static Employee getManager(String department){
        Manager manager= (Manager) EMPLOYEE_MAP.get(department);
        if(manager==null){
            synchronized (EmployeeFactory.class) {
                if(manager==null) {
                    System.out.println("创建" + department + "经理");
                    manager = new Manager(department);
                    manager.setReportContent(department + "部门的汇报...........");
                    EMPLOYEE_MAP.put(department, manager);
                }
            }
        }
        return manager;
    }
}
