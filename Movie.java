package com.itheima.movie;

public class Movie {

    //成员变量
    private String name;
    private double score;
    private double price;
    private String actor;
    //创建无参构造器

    public Movie() {
    }

    //创建一个有参构造器

    public Movie(String name, double score, double price, String actor) {
        this.name = name;
        this.score = score;
        this.price = price;
        this.actor = actor;
    }


    //提供成套的getter和setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }
}
