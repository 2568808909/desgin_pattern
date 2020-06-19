package cn.ccb.pattern.structural.flyweight;


public class Manager implements Employee {

    private String department;

    private String reportContent;

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    public Manager(String department) {
        this.department = department;
    }

    public void report() {
        System.out.println(department + "部门经理汇报: " + reportContent);
    }
}
