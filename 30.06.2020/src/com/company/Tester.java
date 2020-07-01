package com.company;

public class Tester extends Employee {


    public Tester(String name, double salary) {
        super(name,salary); //super-это ссылка на родителя
    }
    public void work(){
        System.out.println("Tester: I am testing");

    }
    @Override
    public String toString() {
        return "Tester"+ super.getName() + "(" + super.getSalary() + ")";

    }

}

 /*
    public void pay(){
        System.out.println("pay "+ getSalary()+" Euro"); */