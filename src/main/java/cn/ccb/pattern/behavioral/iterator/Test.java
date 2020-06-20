package cn.ccb.pattern.behavioral.iterator;

public class Test {
    public static void main(String[] args) {
        CourseComponent courseComponent=new CourseCataLog("immoc");
        courseComponent.add(new Course("数据结构",50));
        courseComponent.add(new Course("计算机网络",60));
        CourseComponent javaCataLog=new CourseCataLog("java");
        javaCataLog.add(new Course("java",59));
        javaCataLog.add(new Course("电商",77));
        courseComponent.add(javaCataLog);
        courseComponent.print();

        //给类实现Iterable后，在实现相应的Iterator即可对某个类进行迭代
        System.out.println();
        System.out.println(courseComponent.getName()+"******************");
        for (CourseComponent component : courseComponent) {
            if(component instanceof CourseCataLog){
                System.out.println(component.getName()+"----------------");
                for (CourseComponent course : component) {
                    course.print();
                }
            }else{
                component.print();
            }
        }

        System.out.println();
        Course course = new Course("数据结构", 50);
        for (CourseComponent c : course) {
            c.print();
        }
    }
}
