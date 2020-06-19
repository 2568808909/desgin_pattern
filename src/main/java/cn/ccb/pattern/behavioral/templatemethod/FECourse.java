package cn.ccb.pattern.behavioral.templatemethod;

public class FECourse extends ACourse {

    @Override
    protected void packageCourse() {
        System.out.println("提供前端源代码");
        System.out.println("提供图片等多媒体文件");
    }


}
