package cn.ccb.pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class EmployeeFactory {
    public final static Map<String, Employee> EMPLOYEE_MAP = new HashMap<>();

    /**
     * 此方法获取Manager对象由始至终只创建了一次，创建后会存储在一个HashMap中
     * @param department 部门
     * @return 部门经理对象
     */
    public static Manager getManager(final String department) {
        return (Manager) EMPLOYEE_MAP.computeIfAbsent(department, k -> {
            System.out.println("创建" + department + "部门经理...");
            Manager m = new Manager(department);
            String reportContent = department + "部门的报告为...";
            System.out.println("创建" + department + "部门的报告");
            m.setReportContent(reportContent);
            return m;
        });
    }
}
