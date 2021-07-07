package ru.netology.domain;

public class Smartphone extends Product {
    private String producer;
    public Smartphone() {
        super();
    }

    public Smartphone(int id, String name, int price, String producer) {
        super(id, name, price);
        this.producer = producer;
        //this.pages = pages;
        //this.publishedYear = publishedYear;
    }

}