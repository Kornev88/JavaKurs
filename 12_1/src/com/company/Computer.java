package com.company;

public class Computer {
     String cpu;
      int ram;
     int hdd;
     double price;

    public Computer(String cpu, int ram, int hdd, double price){
        this.cpu=cpu;
        this.ram=ram;
        this.hdd=hdd;
        this.price=price;
    }
    public String toString(){
        return "Computer: "+"CPU: "+cpu+", RAM: "+ram+", HDD: "+hdd+", Price: "+price+" Euro";
    }
    public int compareTo(Computer computer){
        if(this.price>computer.price) return 1;
        if(this.price<computer.price) return -1;
        return 0;
    }
}
