package cn.ccb.pattern.behavioral.chain_of_respsonsibility;

public class Test {

    public static void main(String[] args) {
        Course course = new Course();
        course.setArticle("手记");
        course.setName("设计模式");
        course.setVideo("www.baidu.com");

        Approver approver=new ArticleApprover();
        Approver videoApprover = new VideoApprover();
        approver.setNextApprover(videoApprover);

        approver.deploy(course);
    }
}
