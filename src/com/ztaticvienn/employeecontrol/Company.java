/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ztaticvienn.employeecontrol;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Michail
 */
public class Company {
    

         
    TreeSet employeeList = new TreeSet();
        
    
    public boolean addFixedSalaryEmployee(Integer id, String name,
            String surname, Integer year, Integer month, Integer day, Gender gender, Double salary){
        //Проверка на отсутствие работника с таким же ID
        Iterator itr = employeeList.iterator();
        while(itr.hasNext()){
            Employee emp =(Employee)itr.next(); 
            if (emp.getId() == id){
                
                return false;
                
            }
        }
        
        Calendar birthDate = new GregorianCalendar();  
        birthDate.set(year, month, day);
        
        FixedSalaryEmployee fse = new FixedSalaryEmployee(id,name,
                surname,birthDate,gender,salary);
        
        employeeList.add(fse);
        
        
        
            
        return true;        
    }
    
    public boolean addHourlyWageEmployee(Integer id, String name,
            String surname, Integer year, Integer month, Integer day, Gender gender, Double hourlywage){
        //Проверка на отсутствие работника с таким же ID
        Iterator itr = employeeList.iterator();
        while(itr.hasNext()){
            Employee emp =(Employee)itr.next(); 
            if (emp.getId() == id){
                
                return false;
                
            }
        }
        Calendar birthDate = new GregorianCalendar();
        birthDate.set(year, month, day);
        
        HourlyWageEmployee hwe = new HourlyWageEmployee(id,name,
                surname,birthDate,gender,hourlywage);
        
        employeeList.add(hwe);
        
        
        
            
        return true;
    }
    
    //Methods To do:
    
    public void ShowAllEmployees(){
        Iterator itr = employeeList.iterator();   
        while(itr.hasNext()){
            Employee emp= (Employee)itr.next();
            if (emp.getSalaryType()==SalaryType.FIXEDSALARY){
                FixedSalaryEmployee fse = (FixedSalaryEmployee)emp;
                System.out.println(fse+ "");
            }
            else{
            HourlyWageEmployee hwe = (HourlyWageEmployee)emp;
            System.out.println(hwe+ "");
            }
        }
    }
    
    public boolean deleteEmployee(){
        
        //TODO
        return true;
    }
    
    public void ShowEmployees(){
        
    }
    
    public void ShowAllEmployeesBy(){
        
    }
    
    public void ShowEmployeesBy(){
        
    }
}
