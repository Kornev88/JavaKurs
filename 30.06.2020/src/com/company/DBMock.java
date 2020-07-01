package com.company;

import com.sun.org.apache.bcel.internal.generic.RETURN;

public class DBMock {
    public static Employee[] getEmployees(){
        Programmer p1= new Programmer("Jack", 2000);
        Programmer p2= new Programmer("Nick", 4000);
        Tester t1 = new Tester ("Anna", 3000);
        Tester t2 = new Tester ("Alex", 1800);

        Employee[] employees = new Employee[]{p1,p2,t1,t2};


        return employees;
    }

}

