package com.codepresso.blog.post;

public class SimplePost extends Post{
    public String username;

    public SimplePost(String content, String username) {
        super(content);
        this.username = username;
    }

    public void save(){
        System.out.println("Saving content, username to database...");
    }
    public String toString(){
        return "\n Content: " + content +
                "\n Username: " + username;
    }
}
