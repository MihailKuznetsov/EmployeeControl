
package com.ztaticvienn.employeecontrol;

import java.util.Calendar;

public abstract class Employee {
    
    //TODO Calculate age
    
    private Integer id;
    private String surname;
    private String name;
    private Calendar birthdate;
    private Gender gender;
    private SalaryType salaryType;
 
        
    public Integer getId(){
        return id;
    }
    
    public void setId(Integer integ){
        this.id = integ;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String str){
        this.name=str;
    }
    
    public String getSurname(){
        return surname;
    }
    
    public void setSurname(String str){
        this.surname=str;
    }
    
    public Calendar getBirthDate(){
        System.out.println(birthdate);
        return birthdate;
    }
    
    public void setBirthDate(Calendar date){
        this.birthdate = date;
    }
    
    public Gender getGender(){
        return gender;
    }
    
    public void setGender(Gender str){
        this.gender = str;
    }
 
    public SalaryType getSalaryType(){
        return salaryType;
    }
    
    public void setSalaryType(SalaryType slt){
        this.salaryType = slt;
    }
               

    
}
