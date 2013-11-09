/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ztaticvienn.employeecontrol;




/**
 *
 * @author Michail
 */
public class MainClass {
    
    public static void main(String[] args) {
    Company mycompany = new Company();
    //mycompany.addFixedSalaryEmployee(1, "John", "Smith", 1985, 3, 2   , Gender.MALE, 1500.0);
    //mycompany.addFixedSalaryEmployee(2, "James", "Watson", 1987, 7, 23, Gender.MALE, 2000.0);
    //mycompany.addHourlyWageEmployee(4, "Will", "Lewis", 1976, 3, 18, Gender.MALE, 4.0);
    //mycompany.addHourlyWageEmployee(3, "Jane", "Johnson", 1976, 4, 11, Gender.FEMALE, 12.0);
    //mycompany.addFixedSalaryEmployee(5, "George", "McCarter", 1984, 3, 15, Gender.MALE, 2300.0);
    EmployeeGenerator empGen = new EmployeeGenerator();
        empGen.fillEmployeeList(29,mycompany);
    mycompany.sortEmployeesBy("id");
    mycompany.showAllEmployees();
    mycompany.sortEmployeesBy("name");
    mycompany.showAllEmployees();
    }
    
    
}
