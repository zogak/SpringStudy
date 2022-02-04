package com.codepresso.blog.post;

public class Post {
    protected String content;

    public Post(String content){
        this.content = content;
    }

    public void save(){
        System.out.println("Saving content to database...");
    }

    public String toString(){
        return "\n Content: " + content;
    }
}
