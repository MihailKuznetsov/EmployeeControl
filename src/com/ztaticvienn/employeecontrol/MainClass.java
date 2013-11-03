/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ztaticvienn.employeecontrol;

import java.util.Calendar;
import java.util.GregorianCalendar;


/**
 *
 * @author Michail
 */
public class MainClass {
    
    public static void main(String[] args) {
    Company mycompany = new Company();
        Calendar birthDate = new GregorianCalendar();
        birthDate.set(1971, 3, 23);
    mycompany.addFixedSalaryEmployee(0001, "John", "Smith", birthDate   , Gender.MALE, 1500.0);
        birthDate.set(1985, 8, 3);
    mycompany.addFixedSalaryEmployee(0002, "James", "Watson", birthDate, Gender.MALE, 2000.0); 
        
    }
    
    
}
