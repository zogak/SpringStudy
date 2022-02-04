package com.codepresso.blog.post;

public class BlogPost extends Post{
    public String title;
    public String username;

    public BlogPost(String title, String content, String username) {
        super(content);
        this.title = title;
        this.username = username;
    }

    public void save(){
        System.out.println("Saving content, title, username to database...");
    }
    public String toString(){
        return  "\n Title: " + title +
                "\n Content: " + content +
                "\n Username: " + username;
    }
}
