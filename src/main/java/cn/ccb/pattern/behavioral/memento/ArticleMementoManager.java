package cn.ccb.pattern.behavioral.memento;

import java.util.Stack;

public class ArticleMementoManager {

    private final static Stack<ArticleMemento> backup=new Stack<>();

    public static void save(ArticleMemento articleMemento){
        backup.push(articleMemento);
    }

    public static ArticleMemento getLastMemento(){
        if(backup.isEmpty()){
            throw new RuntimeException("没有存档");
        }
        return backup.pop();
    }
}
