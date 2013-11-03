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
    mycompany.addFixedSalaryEmployee(0001, "John", "Smith", 1985, 3, 2   , Gender.MALE, 1500.0);
    mycompany.addFixedSalaryEmployee(0002, "James", "Watson", 1987, 7, 23, Gender.MALE, 2000.0);
    mycompany.addFixedSalaryEmployee(0001, "Will", "Lewis", 1976, 4, 18, Gender.MALE, 4.0);
        mycompany.ShowAllEmployees();
    }
    
    
}
