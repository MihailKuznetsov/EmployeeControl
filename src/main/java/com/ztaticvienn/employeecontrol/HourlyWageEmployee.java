/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ztaticvienn.employeecontrol;

import java.util.Calendar;
/*
 *
 * @author Michail
 */

public final class HourlyWageEmployee extends Employee{

        private Double hourlywage;
        
        public Double getHourlyWage(){
            return hourlywage;
        }
        
        public void setHourlyWage(Double dbl){
            this.hourlywage = dbl;
        }
        
            @Override
         public String toString(){
            return ""+getId()+" "+getSurname()+" "+getName()+" "+getBirthDate()+" "+getGender()+" "
                +" "+getSalaryType()+" "+getAverageSalary();
        }
    
    public HourlyWageEmployee(Integer id, String name, String surname, Calendar birthdate, Gender gender,Double hourlywage){
        
        this.setId(id);
        this.setName(name);
        this.setSurname(surname);
        this.setBirthDate(birthdate);
        this.setGender(gender);
        this.setHourlyWage(hourlywage);
        this.setSalaryType(SalaryType.HOURLYWAGE);
        
    }


    @Override
    public Double getAverageSalary() {
        return 20.8*8*hourlywage;
    }
}