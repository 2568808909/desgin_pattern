package cn.ccb.pattern.behavioral.memento;

public class Test {

    public static void main(String[] args) {
        Article article = new Article("Java设计模式", "备忘录模式", "www.baidu.com");
        System.out.println(article);
        ArticleMementoManager.save(article.save());

        article.setContent("Spark Shuffle");
        article.setImages("www.bilibil.com");
        article.setTitle("大数据");
        System.out.println(article);

        article.load(ArticleMementoManager.getLastMemento());
        System.out.println(article);
    }
}
