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
    
    public static void main(String[] args) throws WrongArgumentException {
    Company mycompany = new Company();
    mycompany.addFixedSalaryEmployee(1, "John", "Smith", 1983, 0, 23   , Gender.MALE, 1500.0);
    mycompany.addFixedSalaryEmployee(2, "James", "Watson", 1983, 0, 23, Gender.MALE, 2000.0);
    mycompany.sortEmployeesBy("id");
    mycompany.showAllEmployees();
    mycompany.sortEmployeesBy("date");
    mycompany.showAllEmployees();
    }
    
    
}
