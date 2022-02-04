package com.codepresso.blog.main;

import com.codepresso.blog.manager.PostManager;
import com.codepresso.blog.post.AnonymousPost;
import com.codepresso.blog.post.BlogPost;
import com.codepresso.blog.post.Post;
import com.codepresso.blog.post.SimplePost;

import java.util.Scanner;

public class BlogSystem {
    public static void main(String[] args) {
        PostManager postManager = new PostManager();
        int menu;
        boolean isQuit = false;
        Post post;

        while(!isQuit) {
            System.out.println("\n1 - View post list");
            System.out.println("2 - Write a post");
            System.out.println("3 - Delete a post");
            System.out.println("4 - quit");
            System.out.print("Enter the menu : ");
            Scanner input = new Scanner(System.in);

            menu = input.nextInt();

            switch (menu) {
                case 1:
                    postManager.printPosts();
                    break;
                case 2:
                    int postMenu;

                    System.out.println("\n1 - Write a Blog Post");
                    System.out.println("2 - Write a Anonymous Post");
                    System.out.println("3 - Write a Simple Post");

                    System.out.print("Enter Post Type : ");
                    Scanner inputPostType = new Scanner(System.in);
                    postMenu = inputPostType.nextInt();

                    if (postMenu == 1) {
                        String title = inputTitle();
                        String content = inputContent();
                        String username = inputUsername();

                        post = new BlogPost(title, content, username);
                        postManager.writePost(post);
                    }
                    else if (postMenu == 2){
                        String title = inputTitle();
                        String content = inputContent();

                        post = new AnonymousPost(content, title);
                        postManager.writePost(post);
                    }

                    else if (postMenu == 3){
                        String content = inputContent();
                        String username = inputUsername();

                        post = new SimplePost(content, username);
                        postManager.writePost(post);
                    }
                    break;
                case 3:
                    System.out.print("Enter index : ");
                    Scanner inputIndex = new Scanner(System.in);
                    int index = inputIndex.nextInt();

                    if (index < 0 || index > postManager.getNumberOfPosts()){
                        System.out.println("Please enter the existing index");
                        break;
                    }
                    else{
                        postManager.deletePost(index);
                        System.out.println("Deleted the post successful");
                    }
                    break;
                case 4:
                    isQuit = true;
                    break;
            }

        }
    }

    private static String inputTitle() {
        System.out.print("Enter title : ");
        Scanner inputTitle = new Scanner(System.in);
        return inputTitle.nextLine();
    }

    private static String inputContent() {
        System.out.print("Enter content : ");
        Scanner inputContent = new Scanner(System.in);
        return inputContent.nextLine();
    }

    private static String inputUsername() {
        System.out.print("Enter username : ");
        Scanner inputUsername = new Scanner(System.in);
        return inputUsername.nextLine();
    }
}