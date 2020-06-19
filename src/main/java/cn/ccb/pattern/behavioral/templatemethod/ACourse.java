package cn.ccb.pattern.behavioral.templatemethod;

/**
 * 制作一个课程，需要的步骤为：
 *  1）制作视频
 *  2）制作PPT
 *  3）制作手记（非必须）
 *  4）打包课程（不同的课程具体实现方式不同）
 */
public abstract class ACourse {

    //模板方法，要用final修饰，防止子类修改
    protected final void makeCourse() {
        this.makeVideo();
        this.makePPT();
        if (needWriteArticle()) {
            this.makeArticle();
        }
        this.packageCourse();
    }

    final void makePPT() {
        System.out.println("制作PPT");
    }

    final void makeVideo() {
        System.out.println("制作视频");
    }

    //钩子方法
    protected boolean needWriteArticle() {
        return false;
    }

    final void makeArticle() {
        System.out.println("编写手记");
    }

    //这是需要子类中各自实现的部分
    protected abstract void packageCourse();
}
