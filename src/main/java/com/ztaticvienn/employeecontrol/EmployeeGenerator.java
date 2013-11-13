package com.ztaticvienn.employeecontrol;

import java.util.Random;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Michail
 * Date: 08.11.13
 * Time: 22:06
 * To change this template use File | Settings | File Templates.
 */
public class EmployeeGenerator {
    private String[] maleNames = {"James","John","Will","Peter","Andrew","David",};

    private String[] femaleNames = {"Jane","Mary","Elizabeth","Rachel","Kate","Judith"};

    private String[] surnames = {"Smith","Watson","Johnson","Carter","Hill","Robertson","Taylor","Thompson","Gram"};

    Random n = new Random();

    public String getRandomMaleName(){
          return (maleNames[n.nextInt(6)]);
    }

    public String getRandomFemaleName(){
          return (femaleNames[n.nextInt(6)]);
    }

    public String getRandomSurname(){
          return (surnames[n.nextInt(9)]);
    }


    public Integer getRandomYear(){
         return 1965+n.nextInt(25);
    }
    public Integer getRandomMonth(){
         return n.nextInt(13);
    }
    public Integer getRandomDay(){
        return n.nextInt(29);
    }

    public double getRandomFixedSalary(){
        return (double)(n.nextInt(25)*100);
    }

    public double getRandomHourlySalary(){
        return (double)(n.nextInt(100));
    }

    public boolean fillEmployeeList(Integer empNum, Company company)throws WrongArgumentException{
        try{
            if(empNum<1)throw new WrongArgumentException("Failed to generate employees: number of employees must be above 0.");

        Integer id=1;
        int randGender, randSalaryType;
        for(Integer i = 1;i<=empNum;i++){
        Random rand = new Random();
        randGender = rand.nextInt(2);
        randSalaryType = rand.nextInt(2);


                switch(randSalaryType){
                    case 0:
                        company.addFixedSalaryEmployee(id++,randGender==0?getRandomMaleName():getRandomFemaleName(),getRandomSurname(),getRandomYear(),
                                getRandomMonth(),getRandomDay(),randGender==0?Gender.MALE:Gender.FEMALE,getRandomFixedSalary());
                        break;
                    case 1:
                        company.addHourlyWageEmployee(id++,randGender==0?getRandomMaleName():getRandomFemaleName(),getRandomSurname(),getRandomYear(),
                                getRandomMonth(),getRandomDay(),randGender==0?Gender.MALE:Gender.FEMALE,getRandomHourlySalary());

                }
        }
        return true;
        }catch(WrongArgumentException wae){
        throw new WrongArgumentException(wae.getMessage());
        }
    }
}
