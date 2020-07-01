package com.company;

public class Book {
    String title;
    String author;
    int price;

public Book(String  title,String author,int price){
    this.author=author;
    this.title=title;
    this.price=price;
}
public String toString(){
    return "Книга: "+title+","+author+", "+"цена: "+price+" Euro" ;
}
}
