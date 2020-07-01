package com.company;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Rafael","Nadal");
        Person person2= new Person("Novak","Dokovic");
        Person person3 = new Person("Roger","Federer");


        Person[] persons = {person1, person2, person3};
        for(int i=0;i<persons.length;i++) {
            System.out.println(persons[i].toString());
        }

    }

}
