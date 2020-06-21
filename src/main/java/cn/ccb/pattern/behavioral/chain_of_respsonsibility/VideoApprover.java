package cn.ccb.pattern.behavioral.chain_of_respsonsibility;

import org.apache.commons.lang.StringUtils;

public class VideoApprover extends Approver{
    @Override
    public void deploy(Course course) {
        if (StringUtils.isNotEmpty(course.getVideo())) {
            System.out.println(course.getName() + "含有视频，批准");
            if (approver != null) {
                approver.deploy(course);
            }
        }else{
            System.out.println(course.getName()+"不包含视频，不批准");
        }
    }
}
