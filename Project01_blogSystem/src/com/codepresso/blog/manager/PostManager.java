package com.codepresso.blog.manager;

import com.codepresso.blog.post.AnonymousPost;
import com.codepresso.blog.post.BlogPost;
import com.codepresso.blog.post.Post;
import com.codepresso.blog.post.SimplePost;

import java.util.ArrayList;
import java.util.List;

public class PostManager {
    public List<Post> postList;

    public PostManager() {
        this.postList = new ArrayList<>();
    }

    public void writePost(Post post) {
        postList.add(post);
        post.save();
    }

    public void printPosts() {
        //for(int i=0; i<postList.size(); i++){
        //   postList.get(i).toString();
        //}

        for(Post post : postList){
            System.out.println(post.toString());
        }
    }

    public void deletePost(int index) {
        postList.remove(index);
    }

    public int getNumberOfPosts() {
        return postList.size();
    }
}
