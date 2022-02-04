package com.codepresso.blog.post;

public class AnonymousPost extends Post{
    public String title;

    public AnonymousPost(String content, String title) {
        super(content);
        this.title = title;
    }
    public void save(){
        System.out.println("Saving content, title to database...");
    }
    public String toString(){
        return "\n Title: " + title +
                "\n Content: " + content;
    }
}
