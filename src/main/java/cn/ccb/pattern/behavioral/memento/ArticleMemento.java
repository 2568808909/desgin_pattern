package cn.ccb.pattern.behavioral.memento;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ArticleMemento {
    private String title;

    private String content;

    private String images;

}
