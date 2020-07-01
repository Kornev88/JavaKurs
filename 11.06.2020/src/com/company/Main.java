package com.company;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("Julia", "Java",new int[]{10,50,25,99});
        Student student2 = new Student("Andrey", "Java", new int[]{70,80,25,99});
        Student student3 = new Student("Marie", "Java", new int[]{10,50});
        Student[] students = {student1,student2,student3};
        System.out.println(bestStudent(students)+"- best Student");
        print(students);

    }
    public static void print(Student[] students){

        for(int i=0; i<students.length; i++){
            System.out.println(students[i].toString());
        }



        }
        public static Student bestStudent(Student[] students){
        Student studentMaxReit=students[0];
        for(int i=0; i<students.length; i++){
            if(studentMaxReit.getReit()<students[i].getReit()){
                studentMaxReit=students[i];

            }


        }
        return studentMaxReit;
    }

}
