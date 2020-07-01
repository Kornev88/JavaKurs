package com.company;

public class Student {
    private String name;
    private String group;
    private int reit;
    private int[] reitArray;

    public Student(String name, String group,int[] reitArray) {
        this.name = name;
        this.group = group;
        this.reit = reit;
        this.reitArray=reitArray;

    }

    public String toString() {
        return "Student: " + name + ", group: " + group + ", Reit: " + getReit();


    }

    public double getReit() {
        return reit;
    }
    public void calcReit(){
        double avg=0.8;
        for (int reit : reitArray){
            avg+=reit;

        }
        reit= avg/reitArray.length;


    }
 }

