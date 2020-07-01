package com.company;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book("Изучаем JAVA", "Кэти Сьерра", 20);
        Book book2 = new Book("Java.Руковдство для начинающих", "Герберт Шилдт", 18);
        Book book3 = new Book("Java для чайников", "Барри Бёрд", 15);


	Book[] books = {book1,book2,book3};
	for (int i=0;i<books.length;i++){
	    System.out.println(books[i].toString());

        }

    }
}
