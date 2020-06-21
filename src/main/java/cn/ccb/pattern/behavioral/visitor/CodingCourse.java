package cn.ccb.pattern.behavioral.visitor;

import lombok.Data;

@Data
public class CodingCourse extends Course{
    private int price;

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
