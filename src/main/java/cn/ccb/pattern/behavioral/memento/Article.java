package cn.ccb.pattern.behavioral.memento;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Article {
    private String title;

    private String content;

    private String images;

    public ArticleMemento save() {
        return new ArticleMemento(title, content, images);
    }

    public void load(ArticleMemento articleMemento) {
        this.title = articleMemento.getTitle();
        this.content = articleMemento.getContent();
        this.images = articleMemento.getImages();
    }
}
