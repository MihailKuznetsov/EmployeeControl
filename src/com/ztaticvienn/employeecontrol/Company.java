/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ztaticvienn.employeecontrol;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;


/**
 *
 * @author Michail
 */
public class Company {
    

         
    ArrayList employeeList = new ArrayList();

    /**
     * Method is used to create FixedSalaryEmployee instance with custom parameters and put in into Company ArrayList.
     * @param id
     * @param name
     * @param surname
     * @param year
     * @param month
     * @param day
     * @param gender
     * @param salary
     * @return
     */
    public boolean addFixedSalaryEmployee(Integer id, String name,
            String surname, Integer year, Integer month, Integer day, Gender gender, Double salary){
        //Check, if TreeSet contains a person with same id
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

    /**
     * Method is used to create HourlyWageEmployee instance with custom parameters and put in into employeeList.
     * @param id
     * @param name
     * @param surname
     * @param year
     * @param month
     * @param day
     * @param gender
     * @param hourlywage
     * @return
     */
    public boolean addHourlyWageEmployee(Integer id, String name,
            String surname, Integer year, Integer month, Integer day, Gender gender, Double hourlywage){

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

    /**
     * Method is used to show the information about employees in employeeList. All employees will be sorted by Id.
     *
     */
    public void showAllEmployees(){

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

    /**
     * e
     */
    public void saveToFile(){

        Iterator itr = employeeList.iterator();
        try{
        PrintWriter pwrt = new PrintWriter(new File("result.txt"));

        while(itr.hasNext()){

            Employee emp= (Employee)itr.next();
            if (emp.getSalaryType()==SalaryType.FIXEDSALARY){
                FixedSalaryEmployee fse = (FixedSalaryEmployee)emp;

                pwrt.println(fse + "");

            }
            else{
                HourlyWageEmployee hwe = (HourlyWageEmployee)emp;
                pwrt.println(hwe + "");
            }
        }
            pwrt.flush();
        }catch(IOException e){

        }



    }

    /**
     * Method is used to delete a employee from employeeList by Id
     * @param id
     * @return
     */
    public boolean deleteEmployee(Integer id){
        Iterator itr = employeeList.iterator();   
        while(itr.hasNext()){
           Employee emp= (Employee)itr.next();
           if (emp.getId()==id){
               itr.remove();
               return true;
           }
        }
        
        return false;
    }

    /**
     * Method is used to show the information about certain employees in employeeList.
     * All employees will be sorted by Id.
     *
     * @param from
     * @param to
     */
    public void showEmployees(int from, int to){

        Iterator itr = employeeList.iterator();
            while(itr.hasNext()){
             Employee emp= (Employee)itr.next();
             if ((emp.getId()>=from)&&(emp.getId()<=to)){
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


    }

    /**
     * Method used for sorting employeeList by certain attribute of employee: id, birthDate, name, surname or salary.
     * @param str
     * @return
     */
    public boolean sortEmployeesBy(String str){
        switch(str){
            case "id":

                Collections.sort((List)employeeList, new CompareId());
                return true;
            case "birthDate":
                Collections.sort((List)employeeList, new CompareDate());
                return true;
            case "name":
                Collections.sort((List)employeeList, new CompareName());
                return true;
            case "surname":
                Collections.sort((List)employeeList, new CompareSurname());
                return  true;
            case "salary":
                Collections.sort((List)employeeList, new CompareSalary());
                return true;
            default:
                return false;


        }


    }
}
