package com.company;

public class Book {
    private Author[] authors;
    private String title;
    private String genre;
    private int id;

    public Book (Author[] authors, String title, String genre, int id){
        this.authors=authors;
        this.title=title;
        this.genre=genre;
        this.id=id;
    }

    public String toString(){
        return "Book -"+" Author: "+authors+", Titel: "+title+", Genre: "+genre+", ID Nr: "+id;
    }


    public Author[] getAuthor (){
        return authors;

    }
    public String getTitle (){
        return title;
    }
    public String getGenre (){
        return genre;
    }
    public int getId (){
        return id;
    }
    public void setId (int id){
        this.id=id;
    }
    private String authorsToString() {
        String str = " ";
        for (int i = 0; i < authors.length; i++) {
            str += authors[i].toString() + " ";
        }
    }
}
