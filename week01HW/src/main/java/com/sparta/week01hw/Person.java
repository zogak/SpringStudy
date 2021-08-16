package com.sparta.week01hw;

public class Person {
    private String name;
    private int age;
    private String job;

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setJob(String job){
        this.job = job;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getJob(){
        return this.job;
    }
}
