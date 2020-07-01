package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Employee[] employees = DBMock.getEmployees();

        for (Employee employee:employees){
            employee.pay();

        }
        for (Employee employee:employees) {
            System.out.println(employee.toString());
        }
        for (Employee employee:employees) {
            employee.work();
        }
    }
}
