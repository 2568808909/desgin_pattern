package cn.ccb.pattern.behavioral.templatemethod;

public class DesignPatternCourse extends ACourse {

    @Override
    protected void packageCourse() {
        System.out.println("提供Java源代码");
    }

    //通过重写钩子方法，可以使该课程需要编写手记
    @Override
    protected boolean needWriteArticle() {
        return true;
    }
}
