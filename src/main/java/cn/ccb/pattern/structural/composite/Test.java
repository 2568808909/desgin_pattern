package cn.ccb.pattern.structural.composite;

public class Test {
    public static void main(String[] args) {
        CourseComponent courseComponent=new CourseCataLog("immoc");
        courseComponent.add(new Course("数据结构",50));
        courseComponent.add(new Course("计算机网络",60));
        CourseComponent javaCataLog=new CourseCataLog("java");
        courseComponent.add(javaCataLog);
        javaCataLog.add(new Course("java",59));
        javaCataLog.add(new Course("电商",77));
        courseComponent.print();
    }
}
