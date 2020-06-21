package cn.ccb.pattern.behavioral.visitor;

import lombok.Data;

@Data
public abstract class Course {
    private String name;

    public abstract  void accept(IVisitor visitor);
}
