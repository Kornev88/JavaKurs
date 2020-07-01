package com.company;

public class StringDemo {

    public StringDemo() {
    }

    public static void main(String[] args) {
            char[] chArray = {'J', 'u', 'l', 'i', 'a'};
            String s = "hello Julia";
            String s1 = new String("Julia");
            String s2 = new String(chArray);
            System.out.println(s2);
            for (char c : chArray) { //(Book c : books)
                System.out.println(c);
            }
            System.out.println("==========================");
            System.out.println(s.compareTo(s1));
            char[] chars=s.toCharArray();
            String newString = s.substring(0,6); //(0,s.length())
            String newString1 = s.substring(5);
            System.out.println(newString);
            System.out.println(newString1);
            System.out.println(newString.trim()); //ubiraet probeli
            String[] string= s.split(" ");
            System.out.println("+++++++++++++++++++++++++++++++++");

            for (String qwe:string){
                System.out.println(qwe);

            }

        }
}
