/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ztaticvienn.employeecontrol;

import java.util.Calendar;

import java.util.HashSet;

/**
 *
 * @author Michail
 */
public class Company {
    
    
    HashSet employeelist = new HashSet();
    
    public boolean addFixedSalaryEmployee(Integer id, String name,
            String surname, Calendar birthdate, Gender gender, Double salary){
        
        FixedSalaryEmployee fse = new FixedSalaryEmployee(id,name,
                surname,birthdate,gender,salary);
        
        employeelist.add(fse);
        
        
        
            
        return true;        
    }
    
    public boolean addHourlyWageEmployee(Integer id, String name,
            String surname, Calendar birthdate, Gender gender, Double hourlywage){
        
        FixedSalaryEmployee hwe = new FixedSalaryEmployee(id,name,
                surname,birthdate,gender,hourlywage);
        
        employeelist.add(hwe);
        
        
        
            
        return true;
    }
        
    public void ShowAllEmployees(){
        //TODO
        
    }
}
