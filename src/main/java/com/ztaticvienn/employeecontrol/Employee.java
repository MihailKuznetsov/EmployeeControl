
package com.ztaticvienn.employeecontrol;

import java.util.Calendar;
import java.util.Date;

public abstract class Employee implements Comparable{
    
    //TODO Calculate age
    
    private Integer id;
    private String surname;
    private String name;
    private Calendar birthDate;
    private Gender gender;
    private SalaryType salaryType;

    public abstract Double getAverageSalary();

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
    
    public Date getBirthDate(){
        return birthDate.getTime();
    }
    
    public void setBirthDate(Calendar date){
        this.birthDate = date;
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



    @Override
    public int compareTo(Object obj) {
        Employee tmp = (Employee)obj;
    if(this.getId() < tmp.getId())
    {
        System.out.println("< "+tmp.getId());
      /* текущее меньше полученного */
      return -1;
    }   
    else if(this.getId() > tmp.getId())
    {
    System.out.println("> "+tmp.getId());  
      /* текущее больше полученного */
      return 1;
    }
    
    System.out.println("0 "+tmp.getId());
    /* текущее равно полученному */
    return 0;
        
    }
    
}
