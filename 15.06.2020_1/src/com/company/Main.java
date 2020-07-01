package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book(new Author("Роберт Мартин") , "Чистый код", "Науч.литература",11);
        Book book2 = new Book(new Author("Стив Макконнелл"),"Совершенный код","Науч.литература",22 );
        Book book3 = new Book(new Author("Джошуа Блох"),"Java. Эффективное программирование","Науч.литература",33);
        Book book4 = new Book(new Author("Кэти Сьерра, Берт Бейтс"),"Изучаем Java","Науч.литература", 44);
        Book[] books = {book1,book2,book3,book4};


        Author author1=new Author("Robert","Martin");
        Author author2=new Author("Robert Martin");
        System.out.println(author1);
        System.out.println(author2);
        printBooks(books);


    }
    public static void printBooks(Book[] books){
        for(int i=0; i<books.length;i++){
            System.out.println(books[i].toString());
        }


    }
}
