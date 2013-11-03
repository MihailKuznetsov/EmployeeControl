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
    
    public HourlyWageEmployee(Integer id, String name, Calendar birthdate, Gender gender,Double hourlywage){
        
        this.setId(id);
        this.setName(name);
        this.setBirthDate(birthdate);
        this.setGender(gender);
        this.setHourlyWage(hourlywage);
        this.setSalaryType(SalaryType.HOURLYWAGE);
        
    }
}