/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ztaticvienn.employeecontrol;

import java.util.Calendar;

/**
 *
 * @author Michail
 */
public final class FixedSalaryEmployee extends Employee{
    
        private Double salary;
        
        public Double getSalary(){
            return salary;
        }
        
        public void setSalary(Double dbl){
            this.salary = dbl;
        }
    
    public FixedSalaryEmployee(Integer id, String name, String surname, Calendar birthdate, Gender gender, Double salary){
        
        this.setId(id);
        this.setName(name);
        this.setSurname(surname);
        this.setBirthDate(birthdate);
        this.setGender(gender);
        this.setSalary(salary);
        this.setSalaryType(SalaryType.FIXEDSALARY);
        
        
        
    }
}
