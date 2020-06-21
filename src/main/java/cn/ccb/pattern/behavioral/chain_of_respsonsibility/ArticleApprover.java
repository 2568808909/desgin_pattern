package cn.ccb.pattern.behavioral.chain_of_respsonsibility;

import org.apache.commons.lang.StringUtils;

public class ArticleApprover extends Approver {
    @Override
    public void deploy(Course course) {
        if (StringUtils.isNotEmpty(course.getArticle())) {
            System.out.println(course.getName() + "含有手记，批准");
            if (approver != null) {
                approver.deploy(course);
            }
        }else{
            System.out.println(course.getName()+"不包含手记，不批准");
        }
    }
}
